package com.cos.blog.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoveUsers {
	private int id;
	private String username;
	private String email; 
	private String address;
	private String userProfile;
	private String userRole;
	private Timestamp createDate;
}
