package com.timf.service.voc.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.timf.model.CompensationVO;
import com.timf.model.ImputeVO;
import com.timf.model.VocVO;
import com.timf.repository.voc.VocXmlRepository;
import com.timf.service.compensation.CompensationService;
import com.timf.service.impute.ImputeService;
import com.timf.service.voc.VocService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VocServiceImpl implements VocService {

    private final VocXmlRepository vocXmlRepository;
    private final ImputeService imputeService;
    private final CompensationService compensationService;
    
    /*************
     voc 목록 조회
     *************/
    @Override
    public List<VocVO> selectVocList() {
//    	List<PenaltyVO> penaltyList = penaltyVocService.selectPenalty();
//    	List<Object> list = new ArrayList<>();
//    	
//    	list.add(vocList);
//    	list.add(penaltyList);
//    	
//    	map.put("data", list);
        return vocXmlRepository.selectVocList();
    }

    /*************
     voc 등록
     *************/
    @Override
    public int insertVoc(VocVO vocVo) {
    	int result;
    	ImputeVO imputeVo = new ImputeVO();
        vocVo.setImputeType(vocVo.getCompRequestYn().equals("Y") ? "0ImpD" : "0ImpC");
        String imputeParty = vocVo.getImputeType();
        imputeVo.setImputeType(imputeParty);
       
        imputeService.insertImpute(imputeVo);
      
        result = vocXmlRepository.insertVoc(vocVo);

        if (vocVo.getCompRequestYn().equals("Y")) {
            CompensationVO compensationVO = CompensationVO.builder()
                    .vocId(vocVo.getVocId())
                    .compensationState("2PntN")
                    .build();

            compensationService.insertCompensation(compensationVO);
        }

        return result;
    }

    /*************
    voc 상태 수정
    *************/
	@Override
	public int updateVocState(CompensationVO compensationVo) {
	return vocXmlRepository.updateVocState(compensationVo);
	}

}
