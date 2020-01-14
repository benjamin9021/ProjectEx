package com.naver;

import java.util.Scanner;

import kr.co.ca.UserDAO;
import kr.co.ca.UserDTO;


public class UserInsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("id입력");
		String did = sc.nextLine();
		System.out.println("name입력");
		String name = sc.nextLine();
		System.out.println("age입력");
		int age = sc.nextInt();
		
		UserDAO dao = new UserDAO();
		UserDTO dto = new UserDTO(did, name, age);
		dao.insert(dto);
	}

}
