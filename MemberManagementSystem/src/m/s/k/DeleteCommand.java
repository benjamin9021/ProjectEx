package m.s.k;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {

		System.out.println("삭제할 id를 입력하세요");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		dao.delete(id);
		
	}

}
