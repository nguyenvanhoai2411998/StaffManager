package com.vti.fontend;

import com.vti.entity.Department;

public class Demo1 {

	public static void main(String[] args) {

		Department department1 = new Department();
		// TẠO PHÒNG BAN ID BẰNG 1
		department1.id = 1;
		department1.name = "sale";

		Department department2 = new Department(2, "name");
		System.out.println("thông tin phòng ban số 2");
		System.out.println(department2.id);
		System.out.println(department2.name);

		// TẠO PHÒNG BAN CÓ ID = 3
		Department department3 = new Department(3);
		System.out.println("id of department3 is: " + department3.id);

		// TẠO PHÒNG BAN CÓ NAME = 'SALE'
		Department department4 = new Department("sale");
		System.out.println(department4.name);

		// KHI TẠO RA 1 ĐỐI TƯỢNG ĐỂ ID MẶC ĐỊNH BẰNG 0, TÊN 'NULL NAME'
		Department department5 = new Department();
		System.out.println("id= " + department5.id);
		System.out.println("name is: " + department5.name);

	}

}
