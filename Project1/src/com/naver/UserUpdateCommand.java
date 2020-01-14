package com.naver;

import java.util.Scanner;

import kr.co.ca.UserDAO;
import kr.co.ca.UserDTO;


public class UserUpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("수정할 id를 입력해주세요");
		String did = sc.nextLine();
		System.out.println("name입력");
		String name = sc.nextLine();
		System.out.println("age입력");
		int age = sc.nextInt();
		
		UserDTO dto = new UserDTO(did, name, age);
		UserDAO dao = new UserDAO();
		
		dao.update(dto);
	}
}