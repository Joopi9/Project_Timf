package com.timf.repository.voc;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.timf.model.CompensationVO;
import com.timf.model.VocVO;

@Mapper
public interface VocXmlRepository {

	/*************
	 voc 목록 조회 
	**************/
	List<VocVO> selectVocList();
	
	/*************
	 voc 등록
	**************/
	int insertVoc(VocVO vocVo);
	
	/*************
	 voc 상태 수정
	**************/
	int updateVocState(CompensationVO compensationVo);

}
