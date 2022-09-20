package com.timf.service.compensation;

import java.util.List;

import com.timf.model.CompensationVO;

public interface CompensationService {

	/*************
	 * 배상 등록 
	 *************/
	int insertCompensation(CompensationVO compensationVO);
	/*************
	 * 배상 수정
	 *************/
	int updateCompensation(CompensationVO compensationVO);
	/*************
	 * 배상 목록 조회
	 *************/
	List<CompensationVO> selectCompensationList();

}
