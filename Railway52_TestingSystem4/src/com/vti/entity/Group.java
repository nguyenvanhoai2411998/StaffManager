package com.vti.entity;

import java.time.LocalDate;

public class Group {

	public int id;
	public String groupName;
	public Account creatorID;
	public LocalDate createDate;
	// trong group có thể có nhiều account--> tạo ra 1 array kiểu Account để lưu trữ
	// values
	public Account[] accounts;
}
