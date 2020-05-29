package com.cos.blog.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoveReply {
	private int id;
	private int userId;
	private int boardId;
	private String content;
	private Timestamp createDate;
}
