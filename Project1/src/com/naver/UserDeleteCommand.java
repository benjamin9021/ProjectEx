package com.naver;

import java.util.Scanner;

import kr.co.ca.UserDAO;


public class UserDeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 id입력");
		String id = sc.nextLine();
		
		UserDAO dao = new UserDAO();
		dao.delete(id);
		System.out.println("정보가 삭제되었습니다.");
		

	}
}
