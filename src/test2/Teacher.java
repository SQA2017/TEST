package test2;

public class Teacher implements Comparable<Teacher> {
	String tid;
	
	Teacher(String tid){
		this.tid = tid;
	}
	public String getTid() {
		return tid;
	}
	
	public void setTid(String tid) {
		this.tid = tid;
	}

	public int compareTo(Teacher t) {
		return this.tid.compareTo(t.getTid());
	}
	
	public String toString() {
		return this.tid;
	}
}

