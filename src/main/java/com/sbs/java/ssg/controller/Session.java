package com.sbs.java.ssg.controller;

import com.sbs.java.ssg.dto.Member;

//Session
//현재 사용자가 이용중인 정보
//이 안의 정보는 사용자가 피로그램을 사용 할 때 동안은 계속 유지
public class Session {
	private Member loginedMember;
	
	public Member getLoginedMember() {
		return loginedMember;
	}
	
	public void setLoginedMember(Member loginedMember) {
		this.loginedMember = loginedMember;
	}
	
	public boolean isLogined() {
		return loginedMember != null;
	}
}