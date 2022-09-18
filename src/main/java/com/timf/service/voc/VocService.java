package com.timf.service.voc;

import com.timf.model.VocVO;

import java.util.List;

public interface VocService {

	/************
	 *voc 목록 API 
	 * @throws Exception 
	 ************/
	public List<VocVO> getVocList();
	/************
	 *voc 등록 API 
	 ************/
	public int insertVoc(VocVO vocVo);
	/************
	 *vocId 조회
	 ************/
//	public HashMap<String, Object> selectVocId();

}
