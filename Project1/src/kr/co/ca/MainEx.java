package kr.co.ca;

import java.util.Scanner;

import com.naver.CarDeleteCommand;
import com.naver.CarInsertCommand;
import com.naver.CarUpdateCommand;
import com.naver.Command;
import com.naver.GetCarDTOByIdCommand;
import com.naver.GetCarListCommand;
import com.naver.GetUserDTOByIdCommand;
import com.naver.GetUserListCommand;
import com.naver.UserDeleteCommand;
import com.naver.UserInsertCommand;
import com.naver.UserUpdateCommand;

public class MainEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Command[] com = { new UserInsertCommand(),new CarInsertCommand(), new GetUserListCommand(),new GetCarListCommand(), new GetUserDTOByIdCommand(),
				new GetCarDTOByIdCommand(),new UserUpdateCommand(), new CarUpdateCommand(), new UserDeleteCommand(), new CarDeleteCommand() 
				};
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("1:회원등록, 2:차등록, 3:회원전체조회, 4:차량전체조회, 5:회원 조회, 6: 차량 조회, 7: 회원 수정, 8: 차량 수정, 9:회원 탈퇴, 10: 차량 파기, 11:종료 ");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu != com.length) {
				Command c = com[menu-1];
				if (c != null) {
					c.execute(sc);
				}
			} else {
				isTrue = false;
			}
		}
		sc.close();
	}
}
