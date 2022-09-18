package com.timf.service.penalty.impl;

import java.util.ArrayList;
import java.util.List;

import com.timf.model.CompensationVO;
import com.timf.service.compensation.CompensationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timf.model.PenaltyVO;
import com.timf.repository.penalty.PenaltyXmlRepository;
import com.timf.service.penalty.PenaltyService;

@Service
public class PenaltyServiceImpl implements PenaltyService {

    @Autowired
    private PenaltyXmlRepository penaltyXmlRepository;
    @Autowired
    private CompensationService compensationService;

    /*************
     * 패널티 등록 API
     *************/
    @Override
    public int insertPenalty(PenaltyVO penaltyVo) {
        return penaltyXmlRepository.insertPenalty(penaltyVo);
    }

    @Override
    public int agreePenalty(PenaltyVO penaltyVo) {
        String agree = penaltyVo.getImputeApprovalYn();
        if (agree != null) {
            CompensationVO compensationVO = new CompensationVO();
            compensationVO.setCompensationId(penaltyVo.getCompensationId());
            compensationVO.setCompensationFine(penaltyVo.getCompensationFine());
            compensationVO.setCompensationState(agree.equals("Y") ? "1VocA" : "1VocD");
            penaltyVo.setPenaltyState(agree.equals("Y") ? "2PntY" : "2PntD");
            compensationService.updateCompensation(compensationVO);
            return penaltyXmlRepository.updatePenalty(penaltyVo);
        }
        return 0;

    }

}
