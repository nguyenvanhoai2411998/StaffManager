package com.vti.entity;

import java.time.LocalDate;

public class Account {

	public int id;
	public String email;
	public String userName;
	public String fullName;
	public Department department;
	public Position position;
	public LocalDate createDate;
	// 1 account có thể tạo ra/ tham gia nhiều group--> tạo Array kiểu group để lưu
	// values
	public Group[] groups;
}
