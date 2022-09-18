package com.timf.model;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PenaltyVO {
	@ApiModelProperty(position=1, value="귀책 Id")
	private int penaltyId;
	@ApiModelProperty(position=2, value="배상Id")
	private int compensationId;
	@ApiModelProperty(position=4, value="배상금액")
	private int compensationFine;
	@ApiModelProperty(position=5, value="귀책인정여부")
	private String imputeApprovalYn;
	@ApiModelProperty(position=6, value="등록일")
	private String regDate;
	@ApiModelProperty(position=7, value="운송사기사Id")
	private int agentDriverId;
	@ApiModelProperty(position=8, value="패널티상태")
	private String penaltyState;
	
}
