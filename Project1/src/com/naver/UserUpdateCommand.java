package com.naver;

import java.util.Scanner;

import kr.co.ca.UserDAO;
import kr.co.ca.UserDTO;


public class UserUpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("������ id�� �Է����ּ���");
		String did = sc.nextLine();
		System.out.println("name�Է�");
		String name = sc.nextLine();
		System.out.println("age�Է�");
		int age = sc.nextInt();
		
		UserDTO dto = new UserDTO(did, name, age);
		UserDAO dao = new UserDAO();
		
		dao.update(dto);
	}
}