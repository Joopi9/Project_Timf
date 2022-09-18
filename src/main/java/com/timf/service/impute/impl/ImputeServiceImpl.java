package com.timf.service.impute.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timf.model.ImputeVO;
import com.timf.repository.impute.ImputeXmlRepository;
import com.timf.service.impute.ImputeService;

@Service
public class ImputeServiceImpl implements ImputeService{
	
	@Autowired
	private ImputeXmlRepository imputeXmlRepository;

	/************
	 *귀책 당사자 등록
	 ************/
	@Override
	public int insertImpute(ImputeVO imputeVo){
		int result = 0;
		try {
			result = imputeXmlRepository.insertImpute(imputeVo);
		}catch(Exception e) {
			e.getMessage();
		}
		return result;
	}

}
