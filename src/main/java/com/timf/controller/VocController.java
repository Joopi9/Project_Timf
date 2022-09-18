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
	@ApiOperation(httpMethod ="GET", value="voc 조회", notes="voc 조회 API")
	@GetMapping
	public Response getVoList() {
			
		return new Response(vocService.getVocList());

	}
	/************
	 *voc 등록 API 
	 ************/
	@ApiOperation(value="voc 등록", notes="voc 등록 API")
	@PostMapping
	public int insertVoc(@RequestBody VocVO vocVo){
		return  vocService.insertVoc(vocVo);
	}


	
	/*****************
	 *배상 요청한 vocID조회 
	 *****************/
//	@ApiOperation(value="배상 요청이 있는 vocId 조회", notes="배상 요청이 있는 vocId 조회 API")
//	@RequestMapping(method=RequestMethod.GET, value="/voc/id", produces=MediaType.APPLICATION_JSON_VALUE)
//	public HashMap<String,Object> getVocId(){
//		HashMap<String, Object> result = vocService.selectVocId();
//		
//		return result;
//	}
	
}