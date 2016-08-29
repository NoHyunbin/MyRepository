package ch07.exam01;

public class DmbCellPhone extends CellPhone{
	// Field
	int channel;
	
	
	// Constructor
	public DmbCellPhone(String model, String color, int channel) {
		// CellPhone으로부터 상속받은 필드
		this.model = model;
		this.color = color;
		// 현재 클래스에 있는 필드
		this.channel = channel;
	}
	
	// Method
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}
