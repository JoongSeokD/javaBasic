package nestedClass;

public class Button {
	
	// ��ø �������̽�
	interface OnClickListener{
		void onClick();
	}
	
	// �������̽� Ÿ�� �ʵ�
	OnClickListener listner;
	
	// �Ű������� ������
	void setOnclickListener(OnClickListener listener) {
		this.listner = listener;
	}
	
	// ���� ��ü�� onClick() �޼ҵ� ȣ��
	void touch() {
		listner.onClick(); 
	}
}
