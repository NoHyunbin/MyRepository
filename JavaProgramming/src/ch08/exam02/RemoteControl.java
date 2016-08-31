package ch08.exam02;

public interface RemoteControl {
	// Constant ( 상수 )
	int MAX_VOLUME = 10;	// public static final int MAX_VOLUME = 10;인데 public static final은 생략한다.
	int MIN_VOLUME = 0;
	
	// Abstract Method
	void turnOn(); 	// public abstract void turnOn(); 인데 public abstract는 생략한다
	void turnOff();
	void setVolume(int volume);	
	
	// Default Method
	default void setMute(boolean mute) {
		if ( mute ) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// Static Method
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
		
	}
	

}
