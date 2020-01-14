package com.naver;

import java.util.ArrayList;
import java.util.Scanner;

import kr.co.ca.UserDAO;
import kr.co.ca.UserDTO;


public class GetUserListCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				UserDAO dao = new UserDAO();
				ArrayList<UserDTO> list = dao.select();

				UserDTO dto = new UserDTO();

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			}
		}).start();
	}

}
