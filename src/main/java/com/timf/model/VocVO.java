package com.timf.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VocVO {
	
	@ApiModelProperty(position=1, value="vocID")
	private int vocId;
	@ApiModelProperty(position=2, value="voc내용")
	private String vocContent;
	@ApiModelProperty(position=3, value="배상요청여부")
	private String compClaimFlag;
	@ApiModelProperty(position=4, value="귀책당사자ID")
	private int imputeId;
	@ApiModelProperty(position=5, value="귀책 타입 (D - 운송자, C - 고객사)")
	private String imputeType;
	@ApiModelProperty(position=6, value="voc상태ID")
	private String vocState;
	@ApiModelProperty(position=7, value="등록일")
	private String regDate;
	
}
