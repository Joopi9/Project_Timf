package com.timf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.timf.model.ImputeVO;
import com.timf.service.impute.ImputeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@Api(tags={"귀책당사자 API"},
	 value="귀책당사자 API"
	)
@RequiredArgsConstructor
public class ImputeController {
	
	@Autowired
	private ImputeService imputeService;
	
	/************
	 *귀책 당사자 등록
	 ************/
	@Transactional
	@ApiOperation(value="귀책당사자 등록", notes="귀책당사자 등록 API")
	@RequestMapping(method=RequestMethod.POST, value="/impute", produces=MediaType.APPLICATION_JSON_VALUE)
	public int insertImpute(@RequestBody ImputeVO imputeVo) {
		int result = imputeService.insertImpute(imputeVo);
		
		return result;
	}

}
