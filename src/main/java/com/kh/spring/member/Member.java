package com.kh.spring.member;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class Member {

	private String userId;
	private String password;
	private String email;
	private String grade;
	
	public int choisunaMemberHashcode() {
		log.info("멤버 해쉬코드 출력");
		return this.hashCode();
	}
	
}
