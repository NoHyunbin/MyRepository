package ch12.exam08;

public class ThreadA extends Thread {
	private WorkObject workObject; // 주입. injection
	
	public ThreadA(WorkObject workObject) {      // Constructor 주입, setter로 하는건 Setter 주입
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for ( int i = 0 ; i < 10 ; i++ ) {
			workObject.methodA();
		}
		
	}

}
