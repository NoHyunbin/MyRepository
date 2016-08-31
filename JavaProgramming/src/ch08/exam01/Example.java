package ch08.exam01;

public class Example {
	public static void powerOn(RemoteControl rc) {
		rc.turnOn();
	}

	public static void main(String[] args) {
		int max = RemoteControl.MAX_VOLUME;
		int min = RemoteControl.MIN_VOLUME;
		
		// Abstract Method는 객체가 없어서 사용할 수 없다.
		// RemoteControl.turnOn();
		// RemoteControl.turnOff();
		// RemoteControl.setVolume(MAX_VOLUME);
		
		// default Method는 객체가 없어서 사용할 수 없다.
		// RemoteControl.setMute(true);
		
		RemoteControl.changeBattery();
		
		// --------------------------------------
		
		Television tv = new Television();
		tv.turnOn();
		
		RemoteControl rc = tv;
		rc.turnOn();

		Audio audio = new Audio();
		audio.turnOn();
		
		rc = audio;
		rc.turnOn();
		
		// --------------------------------------]
		
		powerOn(new Television());
		powerOn(new Audio());
		
	}

}
