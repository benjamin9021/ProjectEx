package com.naver;

import java.util.Scanner;

import kr.co.ca.CarDAO;
import kr.co.ca.CarDTO;


public class CarInsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("id입력");
		String did = sc.nextLine();
		System.out.println("색상입력");
		String cclr = sc.nextLine();
		System.out.println("차번호입력");
		int cnum = sc.nextInt();
		
		CarDAO dao = new CarDAO();
		CarDTO dto = new CarDTO(did, cclr, cnum);
		dao.insert(dto);
	}

}
