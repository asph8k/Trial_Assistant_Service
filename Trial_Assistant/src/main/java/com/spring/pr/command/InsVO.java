package com.spring.pr.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE Ins (
<<<<<<< HEAD
	INS_NUM_SEQ	NUMBER(30)	NOT NULL,
=======
	INS_NUM	NUMBER(30)	NOT NULL,
>>>>>>> baabace3153818189366cafafda639c8a6261119
	INS_NAME	VARCHAR(30)	NOT NULL,
	INS_PHONE	VARCHAR(30)	NOT NULL,
	INS_FAXNUM	VARCHAR(30)	NOT NULL,
	INS_ADDR	VARCHAR(50)	NOT NULL,
	INS_ADDR_DETAIL	VARCHAR(50)	NOT NULL,
	INS_RGSTR	DATE DEFAULT sysdate	NOT NULL,
	INS_RLS	DATE	NULL,
	JOIN_ID	VARCHAR(255)	NOT NULL
	);
<<<<<<< HEAD
	
	CREATE SEQUENCE INS_NUM_SEQ_NAME
    START WITH 1
    INCREMENT BY 1
    MAXVALUE 1000
    NOCACHE
    NOCYCLE;
=======
>>>>>>> baabace3153818189366cafafda639c8a6261119
 */

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class InsVO {
	
	private int InsNum;
	private String InsName;
<<<<<<< HEAD
	private String InsPhone;
	private String InsFaxNum;
=======
	private int InsPhone;
	private int InsFaxNum;
>>>>>>> baabace3153818189366cafafda639c8a6261119
	private String InsAddr;
	private String InsAddrDetail;
	private Timestamp InsRgstr;
	private Timestamp InsRls;
	private String JoinId;
	
}
