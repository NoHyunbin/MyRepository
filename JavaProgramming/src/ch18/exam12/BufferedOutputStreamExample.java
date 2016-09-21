package ch18.exam12;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) throws IOException {
		long start = 0 ;
		long end = 0 ;
		
		//----------------------------------------------------------------------------------
		// 버퍼를 사용하지 않은 경우
		FileInputStream fis = new FileInputStream("src/ch18/exam10/Tulips.jpg");
		FileOutputStream fos = new FileOutputStream("src/ch18/exam10/Tulips2.jpg");
		
		int value;
		
		start = System.currentTimeMillis();
		while ( ( value = fis.read() ) != -1 ) {
			fos.write(value);
		}
		fos.flush();
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않은 경우\t : " + (end-start));
		
		fis.close();
		fos.close();
		
		// ---------------------------------------------------------------------------------
		// 버퍼를 사용하는 경우
		FileInputStream fis2 = new FileInputStream("src/ch18/exam10/Tulips.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		FileOutputStream fos2 = new FileOutputStream("src/ch18/exam10/Tulips2.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos2);		
		
		start = System.currentTimeMillis();
		while ( ( value = bis.read() ) != -1 ) {
			bos.write(value);
		}
		bos.flush();
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하는 경우\t : " + (end-start));
		
		bis.close();
		bos.close();
		fis2.close();
		fos2.close();
		
		
	}

}
