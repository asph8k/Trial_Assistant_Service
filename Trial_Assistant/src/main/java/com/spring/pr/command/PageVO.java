package com.spring.pr.command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageVO {

	//사용자가 선택한 페이지 번호
	private int pageNum;
	
	//해당 페이지에 보여질 게시물 갯수
	private int cpp;
	
	//검색에 필요한 데이터 변수들
	private String keyword;
	private String condition;
	
	public PageVO() {
		this.pageNum = 1;
		this.cpp = 20;
	}
	
}
