package myExercise;

public class CoinDriver {

	public static void main(String[] args) {
		MonetaryCoin[] mcArray = {new MonetaryCoin(10), new MonetaryCoin(50)
							,new MonetaryCoin(100) , new MonetaryCoin(500)};
		
		MonetaryCoin monetaryCoin = new MonetaryCoin(0);
		System.out.println("coins[0] : 10원짜리 동전");
		System.out.println("coins[1] : 50원짜리 동전");
		System.out.println("coins[2] : 100원짜리 동전");
		System.out.println("coins[3] : 500원짜리 동전");
		System.out.println();
		
		int sum = monetaryCoin.sum(mcArray);
		System.out.println("앞면인 동전의 합 : " + sum);
		System.out.println();
		
		monetaryCoin.setValue(0);
		System.out.println(" * 한번씩 던진 후 *");
		System.out.println();
		for( int i = 0 ; i < 4 ; i ++ ) {
			mcArray[i].flip();
		}

		sum = monetaryCoin.sum(mcArray);
		System.out.println("앞면인 동전의 합 : " + sum);
		
	}

}
