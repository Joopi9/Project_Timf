package com.timf.controller;

import com.timf.config.Response;
import com.timf.model.VocVO;
import com.timf.service.voc.VocService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"voc API"},
	 value = "voc API"
	)
@RestController
@RequestMapping("/voc")
public class VocController {

	private VocService vocService;

	@Autowired
	public VocController(VocService vocService) {
		this.vocService = vocService;
	}
	
	/************
	 *voc 목록 API 
	 ************/
	@ApiOperation(value="voc 조회", notes="voc 조회 API")
	@RequestMapping(method=RequestMethod.GET)
	public Response selectVoList() {
			
		return new Response(vocService.selectVocList());

	}
	
	/************
	 *voc 등록 API 
	 ************/
	@ApiOperation(value="voc 등록", notes="voc 등록 API")
	@RequestMapping(method=RequestMethod.POST)
	public Response insertVoc(@RequestBody VocVO vocVo){
		int result = vocService.insertVoc(vocVo);
		String message = result < 0 ? "FAIL" : "SUCCESS";
		return  new Response(message);
	}
	
}