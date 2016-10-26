package com.mycompany.myweb.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.myweb.dao.MemberDao;
import com.mycompany.myweb.dto.Member;

@Component
public class MemberService {
	public static final int JOIN_SUCCESS = 0;
	public static final int JOIN_FAIL = 1;
	
	public static final int LOGIN_SUCCESS = 0;
	public static final int LOGIN_FAIL_MID = 1;
	public static final int LOGIN_FAIL_MPASSWORD = 2;
	
	public static final int LOGOUT_SUCCESS = 0;
	public static final int LOGOUT_FAIL = 1;
	
	public static final int MODIFY_SUCCESS = 0;
	public static final int MODIFY_FAIL = 1;
	
	public static final int WITHDRAW_SUCCESS = 0;
	public static final int WITHDRAW_FAIL = 1;
	
	@Autowired
	private MemberDao memberDao;
	
	public int join(Member member) {
		memberDao.insert(member);
		return JOIN_SUCCESS;
	}
	
	public int login(String mid, String mpassword, HttpSession session) {
		Member member = memberDao.selectByMid(mid);
		if ( member == null ) return LOGIN_FAIL_MID;
		if ( member.getMpassword().equals(mpassword) == false ) return LOGIN_FAIL_MPASSWORD;
		session.setAttribute("login", mid);
		return LOGIN_SUCCESS;
	}
	
	public int logout(HttpSession session) {
		session.removeAttribute("login");
		return LOGOUT_SUCCESS;		
	}
	
	public String findMPassword(String mid, String memail) {
		Member member = memberDao.selectByMid(mid);
		if ( member == null ) return null;
		if ( member.getMemail().equals(memail) == false ) return null;
		return member.getMpassword();
	}
	
	public String findMid(String memail) {
		return memberDao.selectByMemail(memail);
	}
	
	public Member info(String mpassword, HttpSession session) {
		String mid = (String) session.getAttribute("login");
		Member member = memberDao.selectByMid(mid);
		if ( member.getMpassword().equals(mpassword) == false ) return null;
		return member;
	}
	
	public int modify(Member member) {
		
	}
	
	public int withdraw(String mpassword, HttpSession session) {
		String mid = (String) session.getAttribute("login");
		Member member = memberDao.selectByMid(mid);
		if ( member.getMpassword().equals(mpassword) == false ) return WITHDRAW_FAIL;
		logout(session);
		memberDao.delete(mid);
		return WITHDRAW_SUCCESS;
	}
	
	public boolean isMid(String mid) {
	
	}

}
