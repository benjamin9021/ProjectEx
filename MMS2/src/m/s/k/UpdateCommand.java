package m.s.k;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {

		System.out.println("id�Է�");
		String id = sc.nextLine();
		System.out.println("name�Է�");
		String name = sc.nextLine();
		System.out.println("age�Է�");
		int age = sc.nextInt();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		MemberDAO dao = new MemberDAO();
		
		dao.update(dto);
		
		
	}

}
