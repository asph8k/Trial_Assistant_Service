package com.spring.pr.ins.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pr.command.InsVO;
import com.spring.pr.ins.mapper.IInsMapper;

@Service
public class InsService implements IInsService {
	
	@Autowired
	private IInsMapper mapper;

	@Override
	public List<InsVO> getInsList() {
		return mapper.getInsList();
	}

	@Override
	public void registIns(InsVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getInsTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public InsVO getInsContent(int InsNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateIns(InsVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteIns(int InsNum) {
		// TODO Auto-generated method stub

	}

}
