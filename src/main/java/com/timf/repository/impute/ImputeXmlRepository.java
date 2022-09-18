package com.timf.repository.impute;

import org.apache.ibatis.annotations.Mapper;

import com.timf.model.ImputeVO;

@Mapper
public interface ImputeXmlRepository {

	/************
	 *귀책 당사자 등록
	 ************/
	int insertImpute(ImputeVO imputeVo);

}
