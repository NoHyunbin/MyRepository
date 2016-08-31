package ch08.exam03;

public class Example {

	public static void main(String[] args) {
		// 추상메소드와 디폴트 메소드는 객체가 있어야 사용 가능하다
		// -> 인스턴스 메소드라고 볼 수 있음
		// 아래 내용은 객체를 생성하지 않았으므로 컴파일 에러가 난다
		// RemoteControl.setMute(true);
		
		RemoteControl rc = new Television();
		rc.setMute(true);
		rc.setVolume(200);
		
		RemoteControl.changeBattery();
	
	}

}
