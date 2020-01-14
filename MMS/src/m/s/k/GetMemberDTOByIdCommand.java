package m.s.k;

import java.util.Scanner;

public class GetMemberDTOByIdCommand implements Command {

	@Override
	public void execute(Scanner sc) {

		System.out.println("idÀÔ·Â");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.getMemberDTOById(id);
		
		System.out.println(dto);
	}

}
