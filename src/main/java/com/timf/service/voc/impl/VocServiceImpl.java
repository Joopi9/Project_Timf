package com.timf.service.voc.impl;

import com.timf.model.CompensationVO;
import com.timf.model.VocVO;
import com.timf.repository.voc.VocXmlRepository;
import com.timf.service.compensation.CompensationService;
import com.timf.service.impute.ImputeService;
import com.timf.service.voc.VocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VocServiceImpl implements VocService {

    @Autowired
    private VocXmlRepository vocXmlRepository;
    @Autowired
    private ImputeService imputeService;
    @Autowired
    private CompensationService compensationService;

    /*************
     voc 목록 조회
     *************/
    @Override
    public List<VocVO> getVocList() {
        return vocXmlRepository.getVocList();
    }

    /*************
     voc 등록
     *************/
    @Override
    public int insertVoc(VocVO vocVo) {
        int result;
        vocVo.setVocState(vocVo.getCompClaimFlag().equals("Y") ? "1VocD" : "1VocW");

        String compensationState = "";
        if (vocVo.getImputeType().equals("D")) {
            compensationState = "0ImpF";
        } else if (vocVo.getImputeType().equals("C")) {
            compensationState = "0ImpC";
        }
        // voc테이블 삽입
        result = vocXmlRepository.insertVoc(vocVo);

        if (vocVo.getCompClaimFlag().equals("Y")) {
            CompensationVO compensationVO = CompensationVO.builder()
                    .vocId(vocVo.getVocId())
                    .compensationState(compensationState)
                    .build();

            compensationService.insertCompensation(compensationVO);
        }

        return result;
    }

}
