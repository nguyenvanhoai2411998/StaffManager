package com.vti.entity;

public class Department {

	public int id;
	public String name;

	// HÀM TẠO KHÔNG THAM SỐ, KHỞI TẠO MẶC ĐỊNH
	public Department() {
		id = 0;
		name = "no name";
	}

	// HÀM KHỞI TẠO CÓ THAM SỐ
	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// HÀM TẠO CÓ THAM SÔ ID
	public Department(int id) {
		super();
		this.id = id;
	}

	// HÀM TẠO CÓ THAM SỐ NAME
	public Department(String name) {
		super();
		this.name = name;
	}

}
