package com.spring.pr.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserBasicVO {
	
	/*
	CREATE TABLE UserBasic (
		JOIN_ID	VARCHAR2(20)	NOT NULL,
		JOIN_SOC_NUM	VARCHAR2(20)	NOT NULL,
<<<<<<< HEAD
		ANM_NO_SEQ	NUMBER(10)	NULL,
=======
		ANM_NO_SEQ	NUMBER(10)	NOT NULL,
>>>>>>> baabace3153818189366cafafda639c8a6261119
		JOIN_PERSON	VARCHAR2(2) DEFAULT 0	NOT NULL	
		); 
	*/

	private String JoinId;
	private String JoinSocNum;
	private int AnmNum;
	private String JoinPerson;
}
