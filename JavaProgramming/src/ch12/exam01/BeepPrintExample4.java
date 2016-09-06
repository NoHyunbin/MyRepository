package ch12.exam01;

public class BeepPrintExample4 {

	public static void main(String[] args) throws InterruptedException {		
		Thread thread = new SoundThread();
		thread.start();    // 이걸 하면 쓰레드 안의 run() 메소드가 실행된다!!!!!
		
		for ( int i = 0 ; i < 5 ; i++ ) {
			System.out.println("띵");
			System.out.println("출력 : " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}

	}

}
