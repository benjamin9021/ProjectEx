
ackage m.s.k;

import java.util.Scanner;

public class GetMemberDTOByIDCommand implements Command {

	@Override
	public void execute(Scanner sc) {

		System.out.println("id�� �Է��ϼ���");
		String id = sc.nextLine();
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.getMemberDTOByID(id);
		
		System.out.println(dto);
		
	}

}
