package ch12.exam13;

public class ThreadGroupExample2 {

	public static void main(String[] args) {
		Thread thread;
		
		thread = new Thread("t1") {
			@Override
			public void run() {
				while ( true ) {
					System.out.println(getName() + " : 실행중....");
					if ( isInterrupted()) {
						break;
					}
				}		
				System.out.println(getName() + " : 종료 ");
			}
		};
		thread.start();
		
		thread = new Thread("t2") {
			@Override
			public void run() {
				while ( true ) {
					System.out.println(getName() + " : 실행중....");
					if ( isInterrupted()) {
						break;
					}
				}		
				System.out.println(getName() + " : 종료 ");
			}
		};
		thread.start();
		
		ThreadGroup sup = new ThreadGroup("sup");
		
		thread = new Thread(sup, "t3") {
			@Override
			public void run() {
				while ( true ) {
					System.out.println(getName() + " : 실행중....");
					if ( isInterrupted()) {
						break;
					}
				}		
				System.out.println(getName() + " : 종료 ");
			}
		};
		thread.start();
		
		thread = new Thread(sup, "t4") {
			@Override
			public void run() {
				while ( true ) {
					System.out.println(getName() + " : 실행중....");
					if ( isInterrupted()) {
						break;
					}
				}		
				System.out.println(getName() + " : 종료 ");
			}
		};
		thread.start();
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		
		// sup.interrupt();
		Thread.currentThread().getThreadGroup().interrupt();
		// 풀이->현재스레드(main).의그룹(main).인터럽트발생!!!
		
	}

}
