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
			System.out.println("1:ȸ�����, 2:�����, 3:ȸ����ü��ȸ, 4:������ü��ȸ, 5:ȸ�� ��ȸ, 6: ���� ��ȸ, 7: ȸ�� ����, 8: ���� ����, 9:ȸ�� Ż��, 10: ���� �ı�, 11:���� ");
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
