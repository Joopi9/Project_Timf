package com.timf.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class CompensationVO {
	
	@ApiModelProperty(position=1, value="배상ID")
	private int compensationId;
	@ApiModelProperty(position=4, value="vocID")
	private int vocId;
	@ApiModelProperty(position=2, value="배상금액")
	private int compensationFine;
	@ApiModelProperty(position=2, value="배상상태명")
	private String compStateName;
	@ApiModelProperty(position=4, value="배상상태 {1VocA: 기사패널티 승인, 1VocD: 이의제기중 }")
	private String compensationState;
	@ApiModelProperty(position=3, value="등록일")
	private String regDate;

	@Builder
	public CompensationVO(int compensationFine, String regDate, int vocId, String compensationState) {
		this.compensationFine = compensationFine;
		this.compensationState = compensationState;
		this.regDate = regDate;
		this.vocId = vocId;
	}
}
