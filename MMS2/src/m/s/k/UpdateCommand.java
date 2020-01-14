package m.s.k;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {

		System.out.println("id입력");
		String id = sc.nextLine();
		System.out.println("name입력");
		String name = sc.nextLine();
		System.out.println("age입력");
		int age = sc.nextInt();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		MemberDAO dao = new MemberDAO();
		
		dao.update(dto);
		
		
	}

}
