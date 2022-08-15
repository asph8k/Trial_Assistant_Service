package com.spring.pr.notice.service;

import java.util.List;

import com.spring.pr.command.TotalApplierVO;

public interface IInsappService {

	//기관 신청자 정보 목록
	List<TotalApplierVO> getInsappList();
	
	//총 기관 신청자 목록 수
	int getInsappTotal();
	
	//기관 신청자 상세 보기
	TotalApplierVO getInsappContent(int AppNum);
	
	//기관 신청자 수정
	void updateInsapp(TotalApplierVO vo);
	
	//기관 신청자 삭제
	void deleteInsapp(int AppNum);
}
