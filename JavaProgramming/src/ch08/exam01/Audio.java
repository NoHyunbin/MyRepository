package ch08.exam01;

public class Audio implements RemoteControl {
	// 리모트콘트롤이라는 인터페이스로 오디오 클래스를 사용한다.

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("현재 Audio 볼륨 : " + volume );
		
	}



}
