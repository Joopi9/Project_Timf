package com.timf.service.compensation.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.timf.model.CompensationVO;
import com.timf.repository.compensation.CompensationXmlRepository;
import com.timf.service.compensation.CompensationService;

@Service
public class CompensationServiceImpl implements CompensationService {

	@Autowired
	private CompensationXmlRepository compensationXmlRepository;

	/************
	 * 배상 등록
	 ************/
	@Override
	public int insertCompensation(CompensationVO compensationVO) {
		int result =0;
		try {
			result = compensationXmlRepository.insertCompensation(compensationVO);
		}catch(Exception e) {
			e.getMessage();
		}
		
		return result;
	}

	@Override
	public int updateCompensation(CompensationVO compensationVO) {
		return compensationXmlRepository.updateCompensation(compensationVO);
	}

	/************
	 * 배상 목록 조회
	 ************/
	@Override
	public List<CompensationVO> selectCompensationList() {
		return compensationXmlRepository.selectCompensationList();

	}
}
