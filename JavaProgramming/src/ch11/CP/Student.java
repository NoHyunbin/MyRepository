package ch11.CP;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public boolean equals ( Object obj ) {
		if ( obj instanceof Student ) {
			Student stu = ( Student ) obj;
			if (studentNum.equals(stu.studentNum)) {
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	

}
