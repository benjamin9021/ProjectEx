package com.naver;

import java.util.Scanner;

import kr.co.ca.UserDAO;
import kr.co.ca.UserDTO;



public class GetUserDTOByIdCommand implements Command {


	@Override
	public void execute(Scanner sc) {
		System.out.println("idÀÔ·Â");
		String did = sc.nextLine();
		
		UserDAO dao = new UserDAO();
		UserDTO dto = dao.selectByDid(did);
		
		System.out.println(dto);

	}
}
