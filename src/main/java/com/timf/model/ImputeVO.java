package com.timf.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class ImputeVO {

	@ApiModelProperty(position=1, value="귀책ID")
	private int imputeId;
	@ApiModelProperty(position=4, value="귀책당사자")
	private String imputeType;
	@ApiModelProperty(position=2, value="등록일")
	private String regDate;
	
}
