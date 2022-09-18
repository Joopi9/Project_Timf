package com.timf.service.penalty;

import com.timf.model.PenaltyVO;

public interface PenaltyService {

	/*************
	 * 패널티 등록 API
	 *************/
	int insertPenalty(PenaltyVO penaltyVo);
	int agreePenalty(PenaltyVO penaltyVo);

}
