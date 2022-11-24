package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;
import com.vti.entity.PositionName;

public class Exercise5Backend {
	public Scanner scanner = new Scanner(System.in);

	public void createNewDepartment() {
		Department department1 = new Department();
		System.out.println("please enter id: ");
		department1.id = scanner.nextInt();
		System.out.println("please enter department Name: ");
		department1.name = scanner.next();

		// show
		System.out.printf("you've created department with id: %d, name: %s", department1.id, department1.name);
		System.out.println();
	}

	public void createNewAccount() {
		Position position1 = new Position();
		position1.id = 1;

		Account account1 = new Account();
		System.out.println("please enter AccountID");
		account1.id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("please enter userName");
		account1.userName = scanner.next();
		System.out.println("please enter fullName");
		account1.fullName = scanner.next();
		System.out.println("please enter email");
		account1.email = scanner.next();

		System.out.println("Select position");
		int input = scanner.nextInt();
		switch (input) {
		case 1:
			position1.name = PositionName.Dev;
			break;
		case 2:
			position1.name = PositionName.PM;
			break;
		case 3:
			position1.name = PositionName.Scrum_Master;
			break;
		case 4:
			position1.name = PositionName.Test;
			break;
		default:
			break;
		}

		account1.position = position1;

		// show
		System.out.printf("you've created account with id: %d, user name: %s, full name: %s, email: %s, Position: %s",
				account1.id, account1.userName, account1.fullName, account1.email, account1.position.name);
		System.out.println();
	}
}
