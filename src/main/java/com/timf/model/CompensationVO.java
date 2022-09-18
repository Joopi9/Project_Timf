package com.timf.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CompensationVO {

	@ApiModelProperty(position=1, value="배상ID")
	private int compensationId;
	@ApiModelProperty(position=2, value="배상금액")
	private int compensationFine;
	@ApiModelProperty(position=3, value="등록일")
	private String regDate;
	@ApiModelProperty(position=4, value="vocID")
	private int vocId;
	@ApiModelProperty(position=4, value="배상 상태")
	private String compensationState;

	@Builder
	public CompensationVO(int compensationFine, String regDate, int vocId, String compensationState) {
		this.compensationFine = compensationFine;
		this.regDate = regDate;
		this.vocId = vocId;
		this.compensationState = compensationState;
	}
}
