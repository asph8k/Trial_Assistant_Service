package com.spring.pr.ins.service;

import java.util.List;

import com.spring.pr.command.InsVO;

public interface IInsService {

	//기관 정보 목록
	List<InsVO> getInsList();
	
	//기관 정보 등록
	void registIns(InsVO vo);
	
	//총 기관 정보 목록 수
	int getInsTotal();
	
	//기관 정보 상세보기
	InsVO getInsContent(int InsNum);
	
	//기관 정보 수정
	void updateIns(InsVO vo);
	
	//기관 정보 삭제
	void deleteIns(int InsNum);
}
