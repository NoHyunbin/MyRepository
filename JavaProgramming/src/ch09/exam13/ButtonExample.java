package ch09.exam13;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		int value = 10 ;
		
		btnOk.setOnClickListener( new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// value = 5; 파이널 특성을 가지므로 불가능
				int result = value; // 값을 읽을 수는 있다
				System.out.println("음악을 재생합니다.");
				
			}
		});

		btnOk.click();
		
	}
	
}