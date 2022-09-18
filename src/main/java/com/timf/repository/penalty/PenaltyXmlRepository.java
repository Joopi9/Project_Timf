package com.timf.repository.penalty;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.timf.model.PenaltyVO;

@Mapper
public interface PenaltyXmlRepository {
	/*************
	 * 패널티 등록 API
	 *************/
	int insertPenalty(PenaltyVO penalty);
	/*************
	 * 패널티 수정 API
	 *************/
	int updatePenalty(PenaltyVO penalty);

}
