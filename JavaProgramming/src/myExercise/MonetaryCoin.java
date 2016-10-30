package myExercise;

public class MonetaryCoin extends Coin{
	private int value;
	
	public MonetaryCoin(int value) {
		this.value=value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public int sum(MonetaryCoin[] coins) {
		int sumValue = value;
		if ( coins.length == 0 ) return sumValue;
		
		for ( int i = 0 ; i < coins.length ; i++ ) {
			if ( coins[i].isHeads() ) {
				sumValue += coins[i].getValue();
			}
			System.out.println("coins[" + i + "] : " + coins[i]);
		}
		return sumValue;
	}

}
