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
		return this.sid.compareTo(s.getSid());
	}
	
	public String toString() {
		return this.sid;
	}
}

