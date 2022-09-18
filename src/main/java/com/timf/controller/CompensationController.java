package com.timf.controller;

import com.timf.config.Response;
import com.timf.service.compensation.CompensationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = {"배상 API"},
        value = "배상 API"
)
@RequestMapping("/compensation")
public class CompensationController {

    @Autowired
    private CompensationService compensationService;

//	/*************
//	 * 배상 첫등록 API
//	 *************/
//	@Transactional
//	@ApiOperation(value="배상 첫등록", notes="배상 첫등록 API")
//	@RequestMapping(method=RequestMethod.POST, value="/compensation", produces=MediaType.APPLICATION_JSON_VALUE)
//	public int insertCompensation() {
//		int result = compensationService.insertCompensation();
//		return result;
//	}

    /*************
     * 배상 목록 조회
     *************/
    @ApiOperation(value = "배상 목록 조회", notes = "배상 목록 조회 API (state - {0 - 패널티 인정 필요, 1 - 패널티 인정, -1 - 패널티 인정 안함})")
    @GetMapping
    public Response selectCompensationList() {
        return new Response(compensationService.selectCompensationList());
    }

    /***************
     *TO-DO:
     *2) 등록된 패널티 중 기사 확인Y이고 vodid가 같은 패널티(들)의 금액을 더한다
     *3) 금액을 배상 테이블에 등록한다(수정으로 해야하나)
     ***************/
}
