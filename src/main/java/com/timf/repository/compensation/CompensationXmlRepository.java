package com.timf.repository.compensation;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.timf.model.CompensationVO;

@Mapper
public interface CompensationXmlRepository {
	
	/************
	 * 배상 등록
	 ************/
	int insertCompensation(CompensationVO compensationVO);
	/************
	 * 배상 등록
	 ************/
	int updateCompensation(CompensationVO compensationVO);
	/************
	 * 배상 목록 조회
	 ************/
	List<CompensationVO> selectCompensationList();

}
