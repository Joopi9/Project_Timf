package com.timf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timf.config.Response;
import com.timf.service.compensation.CompensationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@Api(tags = {"배상 API"},
        value = "배상 API"
)
@RequestMapping("/compensation")
@RequiredArgsConstructor
public class CompensationController {

    private final CompensationService compensationService;

    /*************
     * 배상 목록 조회
     *************/
    @ApiOperation(value = "배상 목록 조회", notes = "배상 목록 조회 API (state: {1VocW: 패널티 인정 필요, 1VocA: 패널티 인정, 1VocD: 패널티 인정 안함})")
    @GetMapping
    public Response selectCompensationList() {
        return new Response(compensationService.selectCompensationList());
    }

}
