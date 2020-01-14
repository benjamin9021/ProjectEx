package com.naver;

import java.util.Scanner;

import kr.co.ca.CarDAO;

public class CarDeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 id입력");
		String id = sc.nextLine();
		
		CarDAO dao = new CarDAO();
		dao.delete(id);
		System.out.println("정보가 삭제되었습니다.");
	}

}
