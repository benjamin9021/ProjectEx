package com.naver;

import java.util.Scanner;

import kr.co.ca.UserDAO;


public class UserDeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ id�Է�");
		String id = sc.nextLine();
		
		UserDAO dao = new UserDAO();
		dao.delete(id);
		System.out.println("������ �����Ǿ����ϴ�.");
		

	}
}
