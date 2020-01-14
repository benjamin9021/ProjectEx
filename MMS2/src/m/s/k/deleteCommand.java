package m.s.k;

import java.util.Scanner;

public class deleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("삭제할 id입력");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.delete(id);
		
		
	}

}
