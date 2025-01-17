package com.spring.pr.insapp.service;

import java.util.List;

import com.spring.pr.command.InsappVO;

public interface IInsappService {

	//기관 신청자 정보 목록
	List<InsappVO> getInsappList();
	
	//총 기관 신청자 목록 수
	int getInsappTotal();
	
	//기관 신청자 상세 보기
	InsappVO getInsappContent(String JoinId);
	
	//기관 신청자 수정
	void updateInsapp(InsappVO vo);
	
	//기관 신청자 삭제
	void deleteInsapp(int AppNum);
}
