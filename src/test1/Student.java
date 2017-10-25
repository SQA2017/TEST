package test1;

public class Student implements Comparable<Student> {
	String sid;
	
	Student(String sid){
		this.sid = sid;
	}
	
	public String getSid() {
		return sid;
	}
	
	public void setSid(String sid) {
		this.sid = sid;
	}

	public int compareTo(Student s) {
		return s.getSid().compareTo(this.sid);
	}
	
	public String toString() {
		return this.sid;
	}
}

