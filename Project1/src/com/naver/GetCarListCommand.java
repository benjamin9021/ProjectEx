package com.naver;

import java.util.ArrayList;
import java.util.Scanner;

import kr.co.ca.CarDAO;
import kr.co.ca.CarDTO;


public class GetCarListCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				CarDAO dao = new CarDAO();
				ArrayList<CarDTO> list = dao.select();

				CarDTO dto = new CarDTO();

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}
			}
		}).start();
	}

}
