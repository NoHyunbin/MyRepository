package ch07.exam02;

public class DmbCellPhone extends CellPhone{
	// Field
	int channel;
	
	
	// Constructor
	public DmbCellPhone(String model, String color, int channel) {
		// 자식 객체가 생성되기 전에 부모 생성자가 먼저 실행되는데 여기서 생성된다.
		// super(); 가 숨겨져 있다고 생각하면 된다.
		
		super(model, color);
//		// CellPhone으로부터 상속받은 필드
//		this.model = model;
//		this.color = color;			// 이거 두개는 super만들면서 필요없어짐
		
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
