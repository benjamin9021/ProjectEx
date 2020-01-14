package com.naver;

import java.util.Scanner;

import kr.co.ca.CarDAO;
import kr.co.ca.CarDTO;


public class CarInsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("id�Է�");
		String did = sc.nextLine();
		System.out.println("�����Է�");
		String cclr = sc.nextLine();
		System.out.println("����ȣ�Է�");
		int cnum = sc.nextInt();
		
		CarDAO dao = new CarDAO();
		CarDTO dto = new CarDTO(did, cclr, cnum);
		dao.insert(dto);
	}

}
