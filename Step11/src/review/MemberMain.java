package review;

public class MemberMain {

	public static void main(String[] args) {
		MemberManager manager = new MemberManager();
		
		manager.addMember(new MemberDTO("1111", "김철수", 20));
		manager.addMember(new MemberDTO("2222", "이철수", 30));
		manager.addMember(new MemberDTO("3333", "박철수", 40));
		manager.addMember(new MemberDTO("4444", "곽철수", 50));
		manager.addMember(new MemberDTO("5555", "우철수", 60));
		manager.addMember(new MemberDTO("6666", "정철수", 70));
		manager.addMember(new MemberDTO("3333", "임철수", 33));
		
		manager.printAllMembers();
		
		manager.findMemberById("3333");
		manager.findMemberById("7777");
		
	}

}
