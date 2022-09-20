package com.timf.controller;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timf.config.Response;
import com.timf.model.PenaltyVO;
import com.timf.service.penalty.PenaltyService;

import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;

@RestController
@Api(tags = {"패널티API"},
        value = "패널티API"
)
@RequestMapping("/penalty")
@RequiredArgsConstructor
public class PenaltyController {

    private final PenaltyService penaltyService;

    /****************
     * 패널티 등록 API
     ****************/
    @PostMapping
    public Response insertPenalty(@RequestBody PenaltyVO penaltyVO) {
        return new Response(penaltyService.insertPenalty(penaltyVO));
    }

    /****************
     * 기사의 패널티 인정여부
     ****************/
    @PatchMapping
    public Response agreePenalty(@RequestBody PenaltyVO penaltyVO) {
        return new Response(penaltyService.agreePenalty(penaltyVO));
    }
    
}
