package com.naver;

import java.util.Scanner;

import kr.co.ca.CarDAO;

public class CarDeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ id�Է�");
		String id = sc.nextLine();
		
		CarDAO dao = new CarDAO();
		dao.delete(id);
		System.out.println("������ �����Ǿ����ϴ�.");
	}

}
