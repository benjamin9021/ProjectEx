package com.naver;

import java.util.Scanner;

import kr.co.ca.CarDAO;
import kr.co.ca.CarDTO;

public class GetCarDTOByIdCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("idÀÔ·Â");
		String did = sc.nextLine();
		
		CarDAO dao = new CarDAO();
		CarDTO dto = dao.selectByDid(did);
		
		System.out.println(dto);
	}

}
