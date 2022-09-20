package com.timf.service.voc;

import com.timf.model.CompensationVO;
import com.timf.model.VocVO;

import java.util.List;

public interface VocService {

	/************
	 *voc 목록 API 
	 ************/
	List<VocVO> selectVocList();
	
	/************
	 *voc 등록 API 
	 ************/
	int insertVoc(VocVO vocVo);
	
	/************
	 *voc 상태 수정
	 ************/
	int updateVocState(CompensationVO compensationVo);

}
