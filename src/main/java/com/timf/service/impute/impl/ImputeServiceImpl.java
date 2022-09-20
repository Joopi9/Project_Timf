package com.timf.service.impute.impl;

import org.springframework.stereotype.Service;

import com.timf.model.ImputeVO;
import com.timf.repository.impute.ImputeXmlRepository;
import com.timf.service.impute.ImputeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ImputeServiceImpl implements ImputeService{
	
	private final ImputeXmlRepository imputeXmlRepository;

	/************
	 *귀책 당사자 등록
	 ************/
	@Override
	public int insertImpute(ImputeVO imputeVo){
		return imputeXmlRepository.insertImpute(imputeVo);
	}

}
