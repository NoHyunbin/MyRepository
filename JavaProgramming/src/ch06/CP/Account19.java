package ch06.CP;

public class Account19 {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int x) {
		if ( x < MIN_BALANCE || x > MAX_BALANCE )
			return;
		balance = x;
	}

}
