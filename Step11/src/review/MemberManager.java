package review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MemberManager {
	private ArrayList<MemberDTO> memberList;

	public MemberManager() {
		memberList = new ArrayList<MemberDTO>();
	}
	
	public void addMember(MemberDTO member) {
		if(memberList.contains(member)) {
			System.out.println("회원 아이디가 중복됩니다.");
		}else {
			memberList.add(member);
			System.out.println("회원 아이디 추가 완료.");
		}
	}
	
	public void printAllMembers() {
		Iterator<MemberDTO> it = memberList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---");
		ListIterator<MemberDTO> lit = memberList.listIterator();
		while(lit.hasNext()) {
			int i = lit.nextIndex();
			System.out.println(i + " " + memberList.get(i));
		}
			
	}
	
	public void findMemberById(String id) {
		if(memberList.contains(new MemberDTO(id, null, 0))) {
			int idx = memberList.indexOf(new MemberDTO(id, null, 0));
			System.out.println(memberList.get(idx));
		}else {
			System.out.println("회원 없음");
		}
	}
}


