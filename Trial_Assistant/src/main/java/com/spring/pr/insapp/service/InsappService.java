package com.spring.pr.insapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.pr.command.InsappVO;
import com.spring.pr.insapp.mapper.IInsappMapper;

@Service
public class InsappService implements IInsappService {

	@Autowired
	private IInsappMapper mapper;
	
	@Override
	public List<InsappVO> getInsappList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInsappTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public InsappVO getInsappContent(String JoinId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateInsapp(InsappVO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteInsapp(int AppNum) {
		// TODO Auto-generated method stub

	}

}
