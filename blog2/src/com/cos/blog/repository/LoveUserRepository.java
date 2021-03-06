package com.cos.blog.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cos.blog.model.LoveUsers;

public class LoveUserRepository {
	private static final String TAG = "UsersRepository";
	
	//싱글톤
	private static LoveUserRepository instance = new LoveUserRepository();
	
	private LoveUserRepository() {}
	
	public static  LoveUserRepository getInstence() {
		return instance;
	}
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public int save(LoveUsers users) {
		final String SQL = "INSERT INTO USERS(id,username,password, email, address, userRole,createDate)"+
							"valuse(USERS_SEQ.nextval,?,?,?,?,?,sysdate)";
		return -1;
	}
}
