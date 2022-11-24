package com.vti.backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Employees;
import com.vti.entity.Engineers;
import com.vti.entity.Gender;
import com.vti.entity.Staff;
import com.vti.entity.Worker;

public class AccountBackEnd {

	// 1 thêm mới cán bộ
	// 2 tìm kiếm theo họ tên
	// 3 hiển thị thông tin theo danh sách cán bộ
	// 4 nhập tên cán bộ và delete cán bộ đó
	// 5 thoát khỏi chương trình

	private Scanner scanner;
	private ArrayList<Staff> staffs;

	// KHỞI TẠO CONSTRUCTOR
	public AccountBackEnd() {
		super();
		scanner = new Scanner(System.in);
		staffs = new ArrayList<>();
	}

	// SHOW MENU
	public void showMenu() {
		while (true) {
			// CREATE MENU
			System.out.println("+----------------please select options-----------------+");
			System.out.printf("| %-53s|\n", "                       choose please");
			System.out.println("+------------------------------------------------------+");
			System.out.printf("| %-53s|\n", "1. Add new employees");
			System.out.printf("| %-53s|\n", "2. Search employees by name");
			System.out.printf("| %-53s|\n", "3. Show info about employees");
			System.out.printf("| %-53s|\n", "4. Delete employees by name");
			System.out.printf("| %-53s|\n", "5. Exit");
			System.out.println("+------------------------------------------------------+");
			System.out.println("Please choose your options");
			// select
			switch (scanner.nextInt()) {
			// 1. THÊM MỚI CÁN BỘ
			case 1:
				addStaffs();
				break;
			// 2. TÌM KIẾM THEO HỌ TÊN
			case 2:
				searchByName();
				break;
			// 3: HIỂN THỊ THÔNG TIN THEO DANH SÁCH CÁN BỘ
			case 3:
				break;
			// 4: NHẬP TÊN CÁN BỘ VÀ XÓA TÊN CÁN BỘ ĐÓ
			case 4:
				break;
			// 5. THOÁT KHỎI CHƯƠNG TRÌNH
			case 5:
				return;
			default:
				break;
			}
		}
	}

	// 1. THÊM MỚI 1 NHÂN VIÊN
	public void addStaffs() {
		// THÊM MỚI NHÂN VIÊN
		System.out.println("please select options below: ");
		System.out.println("1: add Workers \t 2: add Employees \t 3: add Engineers");

		switch (scanner.nextInt()) {
		case 1:
			addWorker();
			break;
		case 2:
			addEmployee();
			break;
		case 3:
			addEngineer();
			break;
		default:
			break;
		}
	}

	public void addWorker() {
		System.out.println("your selction is 'add Workers'");
		System.out.println("please enter name:");
		Worker worker = new Worker();
		scanner.nextLine();
		worker.setName(scanner.nextLine());

		System.out.println("please enter age:");
		worker.setAge(scanner.nextInt());

		System.out.println("please enter Gender(1: Male   2:FeMale   3:Unknow)");
		switch (scanner.nextInt()) {
		case 1:
			worker.setGender(Gender.Male);
			break;
		case 2:
			worker.setGender(Gender.Female);
			break;
		case 3:
			worker.setGender(Gender.Unknow);
			break;

		default:
			break;
		}

		System.out.println("Please enter address");
		scanner.nextLine();
		worker.setAdress(scanner.nextLine());

		System.out.println("please enter level");
		worker.setLevel(scanner.nextLine());

		// THÊM NHÂN VIÊN VỪA TẠO VÀO ARRAYLIST
		staffs.add(worker);

		// SHOW INFOR RA CONSOLE
		System.out.println("your worker infor is:\n");
		worker.displayInformation();
	}

	public void addEmployee() {
		System.out.println("your selction is 'add Employees'");
		System.out.println("please enter name:");
		Employees employees = new Employees();
		scanner.nextLine();
		employees.setName(scanner.nextLine());

		System.out.println("please enter age");
		employees.setAge(scanner.nextInt());

		System.out.println("please enter Gender(1: Male   2:FeMale   3:Unknow)");
		switch (scanner.nextInt()) {
		case 1:
			employees.setGender(Gender.Male);
			break;
		case 2:
			employees.setGender(Gender.Female);
			break;
		case 3:
			employees.setGender(Gender.Unknow);
			break;

		default:
			break;
		}

		System.out.println("Please enter address");
		scanner.nextLine();
		employees.setAdress(scanner.nextLine());

		System.out.println("please enter job");
		employees.setJob(scanner.nextLine());

		// THÊM NHÂN VIÊN VỪA TẠO VÀO ARRAYLIST
		staffs.add(employees);

		// SHOW INFOR RA CONSOLE
		System.out.println("your worker infor is:");
		System.out.printf("%-20s|", "Name");
		System.out.printf("%-20s|", "Age");
		System.out.printf("%-20s|", "Gender");
		System.out.printf("%-20s|", "Address");
		System.out.printf("%-20s|%n", "Job");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		employees.displayInformation();
	}

	public void addEngineer() {

		System.out.println("your selction is 'add Engineers'");
		System.out.println("please enter name:");
		Engineers engineers = new Engineers();
		scanner.nextLine();
		engineers.setName(scanner.nextLine());

		System.out.println("please enter age");
		engineers.setAge(scanner.nextInt());

		System.out.println("please enter Gender(1: Male   2:FeMale   3:Unknow)");
		switch (scanner.nextInt()) {
		case 1:
			engineers.setGender(Gender.Male);
			break;
		case 2:
			engineers.setGender(Gender.Female);
			break;
		case 3:
			engineers.setGender(Gender.Unknow);
			break;

		default:
			break;
		}

		System.out.println("Please enter address");
		scanner.nextLine();
		engineers.setAdress(scanner.nextLine());

		System.out.println("please enter Major");
		engineers.setMajor(scanner.nextLine());

		// THÊM NHÂN VIÊN VỪA TẠO VÀO ARRAYLIST
		staffs.add(engineers);

		// SHOW INFOR RA CONSOLE
		System.out.println("your worker infor is:");
		System.out.printf("%-20s|", "Name");
		System.out.printf("%-20s|", "Age");
		System.out.printf("%-20s|", "Gender");
		System.out.printf("%-20s|", "Address");
		System.out.printf("%-20s|%n", "Major");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		engineers.displayInformation();
	}

	// 2. TÌM KIẾM THEO HỌ TÊN
	public void searchByName() {
		System.out.println("please enter name of employees:");
		for (int i = 0; i < staffs.size(); i++) {
			scanner.nextLine();
			// KIỂM TRA CHUỖI NHẬP VÀO CÓ BAO GỒM SỐ HAY KHÔNG
			// NẾU KHÔNG, YÊU CẦU NHẬP LẠI
			String input;
			input = scanner.nextLine();
			char[] charArray = input.replaceAll(" ", "").toCharArray();
			for (char c : charArray) {
				if ((c < 'A') || (c > 'z') || ((c > 'Z') && (c < 'a'))) {
					System.out.println("name cannot include special character or number");
					searchByName();
					break;
				}
			}

			if (input.equalsIgnoreCase(staffs.get(i).getName())) {
				System.out.println("info of employees " + staffs.get(i).getName() + " is:");
				staffs.get(i).displayInformation();
			}
		}
	}

}
