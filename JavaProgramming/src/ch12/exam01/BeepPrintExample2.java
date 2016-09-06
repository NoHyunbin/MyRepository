package ch12.exam01;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 툴킷은 정적메소드를 통해서 이런 식으로 객체를 생성해요~
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for ( int i = 0 ; i < 5 ; i++ ) {
					toolkit.beep();
					System.out.println("소리 : " + Thread.currentThread().getName());
					try {
						Thread.sleep(500);
					} catch (Exception e) {}
				}				
			}
		});
		
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
