package ch07.exam13;

public class HomePhone extends Phone {
	public String address;

	@Override
	public void ring() {
		System.out.println("집 띠리링~");
	}

}
