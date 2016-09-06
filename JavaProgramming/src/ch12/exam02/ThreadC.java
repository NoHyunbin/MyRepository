package ch12.exam02;

public class ThreadC extends Thread{
	public ThreadC(int num) {
		setName("ThreadC-" + num);
	}
	@Override
	public void run() {
		for ( long i = 0 ; i < 2000000000L ; i++ ) {
			
		}
		
		System.out.println(getName() + " 종료");

	}

}
