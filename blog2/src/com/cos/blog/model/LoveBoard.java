package com.cos.blog.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoveBoard {
	private int id;
	private int usersId;
	private String title;
	private String content;
	private int readCount;
	private Timestamp createDate;
}
