package ch06.exam07;

public class Board {
	
	//field
	int no;
	String title;
	String content;
	String writer;
	int hitcount;
	
	
	//constructor Overloading
	Board(){
		
	}
	Board(int no){
		this(no,null,null,null,0);
	}
	//Board(int hitcount){} 매개변수의 개수와 타입이 중복되서 오버로딩의 조건2개를 위배
	Board(int no,String title){
		this(no,title,null,null,0);
	}
	Board(int no,String title,String content){
		this(no,title,content,null,0);
	}
	Board(int no,String title,String content,String writer){
		this(no,title,content,writer,0);
	}
	Board(int no,String title,String content,String writer,int hitcount){
		this.no = no;
		this.title = title;
		this.content=content;
		this.writer = writer;
		this.hitcount=hitcount;
	}
	
	
	//Method
}
