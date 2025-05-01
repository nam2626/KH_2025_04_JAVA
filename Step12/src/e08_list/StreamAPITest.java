package e08_list;

import java.util.ArrayList;
import java.util.List;

public class StreamAPITest {
	/*
	 * 	Stream API
	 * 		컬렉션에서 데이터를 함수형 스타일로 처리
	 * 		병렬처리용 parallelStream()
	 * 
	 */
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
		
		//전체 데이터 출력
		list.stream().forEach(item -> item.printInfo());
		System.out.println("-------");
		//평점이 3.0 이상인 학생들만 출력
		List<StudentDTO> filterList =
				list.stream().filter(
						item -> item.getScore() >= 3.0).toList();
		
		filterList.stream().forEach(item -> item.printInfo());
		//전체 평점 평균 출력
		double avg = 0.0;
		ArrayList<Double> scoreList = new ArrayList<Double>();
		list.stream().forEach(item -> scoreList.add(item.getScore()));
		//reduce(초기값, (누적된값, 현재값) -> 리턴할 결과값)
		avg = scoreList.stream().reduce(0.0, (acc, cur) -> acc + cur);
		avg /= list.size();
		System.out.println("전체 평점 평균 : " + avg);
		//학생 정보 중에 제일 평점이 높은 학생을 출력
		
		
		
	}

}




