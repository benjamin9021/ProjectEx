package m.s.k;

import java.util.Scanner;

public class deleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("������ id�Է�");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.delete(id);
		
		
	}

}
