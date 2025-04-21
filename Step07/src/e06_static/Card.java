package e06_static;
/*
 * 	Card
 * 		필드 : 카드번호, 사용자 이름
 * 		생성자
 * 			사용자 이름을 받아서 초기화
 * 			
 * 
 * 		toString 작성 -->  이름 / 카드번호
 * 		
 * 		CardMain 클래스 만들어서 테스트까지 완료 
 */
public class Card {
	private int cardNo;
	private String name;
	
	private static int cardNoSeq = 1000;
	
	public Card(String name) {
		this.name = name;
		this.cardNo = ++cardNoSeq;
	}

	@Override
	public String toString() {
		return name + " / " + cardNo;
	}
	
	
}






