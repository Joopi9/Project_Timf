package com.timf.service.impute;

import com.timf.model.ImputeVO;

public interface ImputeService {

	/************
	 *귀책 당사자 등록
	 * @throws Exception 
	 ************/
	int insertImpute(ImputeVO imputeVo);

}
