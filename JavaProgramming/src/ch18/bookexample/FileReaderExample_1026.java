package ch18.bookexample;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample_1026 {

	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("src/ch18/bookexample/FileReaderExample_1026.java");
		
		int readCharNo;
		
		char[] cbuf = new char[100];
		
		while( (readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		
		fr.close();
	}

}
