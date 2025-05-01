package e05_event;


public class EventMain {

	public static void main(String[] args) {
		Button btnRegister = new Button("회원가입");
		btnRegister.setClickListener(
				new ButtonRegisterOnClickListener());
		btnRegister.onClick();
		
		String id = "admin";
		Button btnLogin = new Button("로그인");
		btnLogin.setClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				System.out.println(view.getName() + " 버튼 클릭");
				//외부에 있는 지역변수나 필드도 바로 접근이 가능
				System.out.println(id + " 로그인 처리");
			}
		});
		btnLogin.onClick();
	}

}



