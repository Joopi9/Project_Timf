package com.timf.service.penalty.impl;

import org.springframework.stereotype.Service;

import com.timf.model.CompensationVO;
import com.timf.model.PenaltyVO;
import com.timf.repository.penalty.PenaltyXmlRepository;
import com.timf.service.compensation.CompensationService;
import com.timf.service.penalty.PenaltyService;
import com.timf.service.voc.VocService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PenaltyServiceImpl implements PenaltyService {

    private final PenaltyXmlRepository penaltyXmlRepository;
    private final CompensationService compensationService;
    private final VocService vocService;

    /*************
     * 패널티 등록 API
     *************/
    @Override
    public int insertPenalty(PenaltyVO penaltyVo) {
        return penaltyXmlRepository.insertPenalty(penaltyVo);
    }

    /*************
     * 패널티 승인 API
     *************/
    @Override
    public int agreePenalty(PenaltyVO penaltyVo) {
        String agree = penaltyVo.getImputeApprovalYn();
        if (agree != null) {
            CompensationVO compensationVo = new CompensationVO();
            compensationVo.setCompensationId(penaltyVo.getCompensationId());
            compensationVo.setCompensationFine(penaltyVo.getCompensationFine());
            compensationVo.setCompensationState(agree.equals("Y") ? "1VocA" : "1VocD");
            penaltyVo.setPenaltyState(agree.equals("Y") ? "2PntY" : "2PntD");
            compensationService.updateCompensation(compensationVo);
            vocService.updateVocState(compensationVo);
        }
        return penaltyXmlRepository.updatePenalty(penaltyVo);
    }

}
