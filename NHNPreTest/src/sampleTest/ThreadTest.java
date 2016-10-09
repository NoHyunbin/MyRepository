package sampleTest;

public class ThreadTest extends Thread {
	
	public static void main(String[] args) throws InterruptedException {
		ThreadTest t = new ThreadTest();
		t.setName("ThreadTest");
		
		t.start();
//		t.join();
		t.run();
		t.doIt();
		
		
	}
	
	public void run() {
		System.out.print("Run... ");
	}
	
	public void doIt() {
		System.out.print("doIt... ");
	}

}
