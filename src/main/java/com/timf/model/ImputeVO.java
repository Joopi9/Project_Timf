package com.timf.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ImputeVO {

	@ApiModelProperty(position=1, value="귀책ID")
	private int imputeId;
	@ApiModelProperty(position=2, value="고객ID")
	private int clientId;
	@ApiModelProperty(position=3, value="기사ID")
	private int driverId;
	@ApiModelProperty(position=4, value="귀책당사자ID")
	private String imputeParty;
}
