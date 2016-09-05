package ch11.exam10;

import java.util.Arrays;

public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = arr1.clone();
		
		System.out.println(arr1 == arr2);
		System.out.println(Arrays.equals(arr1, arr2));
			
		Member m1 = new Member("hong", "길동");
		System.out.println(m1);
		
		Member m2 = (Member) m1.clone();
		
		System.out.println(m1 == m2);
		System.out.println(m2);
		
		// 혼자 연습
		m1.mname = "하이";
		System.out.println(m1);
		System.out.println(m2); // String은 바꾸면 객체가 새로 생기니까 
		
		m1.x[1] = 6;
		System.out.println(m1.x[1]);
		System.out.println(m2.x[1]); // array는 같은 객체를 가르키므로 m1바꾸면 m2도 바뀜!!

	}
}
	
class Member implements Cloneable { 
	String mid;
	String mname;
	int[] x = { 1, 2, 3 };
	
	Member(String mid, String mname) {
		this.mid = mid;
		this.mname = mname;
	}
	
	@Override
	public String toString() {
		return mid + " : " + mname;
	
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}