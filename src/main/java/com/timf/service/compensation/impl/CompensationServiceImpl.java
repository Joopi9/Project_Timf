package com.timf.service.compensation.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timf.model.CompensationVO;
import com.timf.repository.compensation.CompensationXmlRepository;
import com.timf.service.compensation.CompensationService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CompensationServiceImpl implements CompensationService {

	private final CompensationXmlRepository compensationXmlRepository;

	/****************
	 * 배상 등록
	 ****************/
	@Override
	public int insertCompensation(CompensationVO compensationVO) {
		return compensationXmlRepository.insertCompensation(compensationVO);
	}
	
	/****************
	 * 배상 상태 수정
	 ****************/
	@Override
	public int updateCompensation(CompensationVO compensationVO) {
		return compensationXmlRepository.updateCompensation(compensationVO);
	}

	/****************
	 * 배상 목록 조회
	 ****************/
	@Override
	public List<CompensationVO> selectCompensationList() {
		return compensationXmlRepository.selectCompensationList();

	}
}
