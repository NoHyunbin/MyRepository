package ch12.exam08;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		System.out.println("ConsumerThread 시작");
		
		if ( this.data == null ) {
			try {
				wait();
			} catch (InterruptedException e) {}			
		}
		
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터 : " + returnValue);
		data = null;
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		System.out.println("producerThread 시작");
		
		if ( this.data != null ) {
			try {
				wait();
			} catch (InterruptedException e) {}			
		}
		
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터 : " + data);
		notify();
	}

}
