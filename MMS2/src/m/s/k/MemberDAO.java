package m.s.k;

import java.util.ArrayList;

public class MemberDAO {

	public static ArrayList<MemberDTO> list = new ArrayList<MemberDTO>(); 
	
	public void insert(MemberDTO dto) {
		list.add(dto);
	}
	public ArrayList<MemberDTO> getList() {
		return list;
	}
	
	public MemberDTO getMemberDTOByID(String id) {
		int idx = list.indexOf(new MemberDTO(id, null, 0));
		if (idx != -1 ) {
			return list.get(idx);
		}else {
			return null;
		}
	}
	public void update(MemberDTO dto) {
		int idx = list.indexOf(dto);
		if (idx != -1) {
			list.set(idx, dto);
		}else {
			System.out.println("È¸¿ø¾Æ´Ô");
		}
	}
	public void delete(String id) {
		MemberDTO dto = new MemberDTO(id, null, 0);
		list.remove(dto);
	}
}
