package m.s.k;

import java.util.ArrayList;
import java.util.Scanner;

public class GetListCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.getList();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
