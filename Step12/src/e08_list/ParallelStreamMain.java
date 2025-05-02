package e08_list;

import java.util.ArrayList;

public class ParallelStreamMain {

	public static void main(String[] args) {
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		//샘플 데이터 10건 리스트에 추가
		list.add(new StudentDTO("S001", "김철수", "컴퓨터공학과", 3.7));
		list.add(new StudentDTO("S002", "이영희", "전기전자공학과", 3.2));
		list.add(new StudentDTO("S003", "박민수", "화학과", 3.9));
		list.add(new StudentDTO("S004", "정지영", "생물학과", 4.0));
		list.add(new StudentDTO("S005", "홍길동", "의학과", 3.5));
		list.add(new StudentDTO("S006", "이지현", "경제학과", 4.2));
		list.add(new StudentDTO("S007", "김영남", "영문학과", 1.3));
		list.add(new StudentDTO("S008", "최민지", "무용학과", 2.3));
		list.add(new StudentDTO("S009", "배영호", "음악학과", 1.2));
		list.add(new StudentDTO("S010", "송영철", "미술학과", 2.5));
		
		list.stream().forEach(t -> {
			System.out.println(t.getStudentNo() + " " + Thread.currentThread().getName()); 
		});
		System.out.println("---------");
		list.parallelStream().forEach(t -> {
			System.out.println(t.getStudentNo() + " " + Thread.currentThread().getName()); 
		});
		
	}

}
