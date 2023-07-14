package com.sbs.java.ssg.dto;

import lombok.Data;

@Data
public class Borad extends Dto {

	private int articleId;
	private int memberId;
	private String body;

}