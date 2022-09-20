package com.timf.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class PenaltyVO {
	@ApiModelProperty(position=1, value="귀책Id")
	private int penaltyId;
	@ApiModelProperty(position=2, value="배상Id")
	private int compensationId;
	@ApiModelProperty(position=4, value="배상금액")
	private int compensationFine;
	@ApiModelProperty(position=9, value="패널티상태명")
	private String penaltyType;
	@ApiModelProperty(position=7, value="운송사기사Id")
	private int agentDriverId;
	@ApiModelProperty(position=5, value="귀책인정여부")
	private String imputeApprovalYn;
	@ApiModelProperty(position=8, value="패널티상태코드")
	private String penaltyState;
	@ApiModelProperty(position=6, value="등록일")
	private String regDate;
}
