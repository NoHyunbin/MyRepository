package ch13.exam04;

import java.util.Date;

public class Example {

	public static void main(String[] args) {
		Map<String, Date> map = new HashMap<String, Date>();
		map.add("입학식", new Date());
		
		Date date = map.get("입학식");
		Date errorDate = map.get("학식");
		
		System.out.println(date);
		System.out.println(errorDate);
		

	}

}