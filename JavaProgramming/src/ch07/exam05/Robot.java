package ch07.exam05;

public class Robot extends Machine {
	@Override
	public void work() {
		System.out.println("Robot - work() 실행");
		super.work();
	} 
	/*
	// final이 붙어있기 때문에 Overriding을 할 수 없다.
	public final void powerOn() {
		System.out.println("전원을 연결합니다.");
	}
	*/
}
