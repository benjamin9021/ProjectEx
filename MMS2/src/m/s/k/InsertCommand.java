package m.s.k;

import java.util.Scanner;

public class InsertCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("id입력");
		String id = sc.nextLine();
		System.out.println("name입력");
		String name = sc.nextLine();
		System.out.println("age입력");
		int age = sc.nextInt();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO(id, name, age);
		dao.insert(dto);
		
	}

}
