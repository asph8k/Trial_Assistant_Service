package com.spring.pr.command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PageCreator {

	//pageVO 담긴 데이트를 사용하기 위해 변수 선언
	private PageVO paging;
	
	//보여질 전체 게시물 개수
	private int TotalArticleIns;
	
	//시작 페이지
	private int beginPage;
	
	//끝 페이지
	private int endPage;
	
	//이전, 다음 페이지 여부
	private boolean prev, next;
	
	
	
}
