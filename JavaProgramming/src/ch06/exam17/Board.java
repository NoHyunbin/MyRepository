package ch06.exam17;

public class Board {
	// Field
	private int no;
	private String title;
	private String writer;
	private int hit;
	private String content;
	
	Board() {};
	Board(int no, String title, String writer, int hit, String content){
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.hit = hit;
		this.content = content;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	
	
}
