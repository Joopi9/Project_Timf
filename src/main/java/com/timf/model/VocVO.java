package com.timf.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VocVO {
	
	@ApiModelProperty(position=1, value="vocID")
	private int vocId;
	@ApiModelProperty(position=4, value="귀책당사자ID")
	private int imputeId;
	@ApiModelProperty(position=2, value="voc내용")
	private String vocContent;
	@ApiModelProperty(position=3, value="배상요청여부")
	private String compRequestYn;
	@ApiModelProperty(position=8, value="귀책당사자")
	private String imputeNm;
	@ApiModelProperty(position=9, value="voc이슈")
	private String vocIssue;
	@ApiModelProperty(position=6, value="voc상태ID")
	private String vocState;
	@ApiModelProperty(position=5, value="귀책 타입 (0ImpD: 운송자, 0ImpC: 고객사)")
	private String imputeType;
	@ApiModelProperty(position=7, value="등록일")
	private String regDate;
	
}
