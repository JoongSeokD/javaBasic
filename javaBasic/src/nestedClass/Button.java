package nestedClass;

public class Button {
	
	// 중첩 인터페이스
	interface OnClickListener{
		void onClick();
	}
	
	// 인터페이스 타입 필드
	OnClickListener listner;
	
	// 매개변수의 다형성
	void setOnclickListener(OnClickListener listener) {
		this.listner = listener;
	}
	
	// 구현 객체의 onClick() 메소드 호출
	void touch() {
		listner.onClick(); 
	}
}
