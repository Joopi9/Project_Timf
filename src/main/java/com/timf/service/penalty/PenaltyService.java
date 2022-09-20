package com.timf.service.penalty;

import com.timf.model.PenaltyVO;

public interface PenaltyService {

	/****************
     * 패널티 등록 API
     ****************/
	int insertPenalty(PenaltyVO penaltyVo);
	 /****************
     * 기사의 패널티 인정여부
     ****************/
	int agreePenalty(PenaltyVO penaltyVo);
	
}
