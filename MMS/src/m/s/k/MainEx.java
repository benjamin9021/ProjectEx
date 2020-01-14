package m.s.k;

import java.util.Scanner;

public class MainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Command[] com = {new InsertCommand()
						,new GetListCommand()
						,new GetMemberDTOByIdCommand()
						,new UpdateCommand()
						,new DeleteCommand()};
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("");
			int menu = sc.nextInt();
			if (menu != com.length) {
				Command c = com[menu];
				if (c != null) {
					c.execute(sc);
				}
			}else {
				isTrue = false;
			}
		}
		
		
		
		sc.close();
		
	}
	
}
