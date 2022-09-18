package com.timf.controller;

import com.timf.model.PenaltyVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.timf.service.penalty.PenaltyService;

import io.swagger.annotations.Api;

@RestController
@Api(tags = {"패널티API"},
        value = "패널티API"
)
@RequestMapping("/penalty")
public class PenaltyController {

    @Autowired
    private PenaltyService penaltyService;

    /***************************
     * TO-DO
     * 0) 배상별로 패널티 기사 확인 컬럼 2PntN인 거 조회
     * 1) 패널티가 등록되면 기사 확인이 필요하다
     * 	  - 확인 api(수정)
     *    - 패널티상태 컬럼 확인으로 수정
     *    - 인정/불인정 컬럼 수정
     * 2) 패널티 불인정 시 이의제기
     ****************************/

    @PostMapping
    public int registerPenalty(@RequestBody PenaltyVO penaltyVO) {
        return penaltyService.insertPenalty(penaltyVO);
    }

    /***************************
     ****************************/

    @PatchMapping
    public int agreePenalty(@RequestBody PenaltyVO penaltyVO) {
        return penaltyService.agreePenalty(penaltyVO);

    }
}
