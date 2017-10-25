package test1;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SortUtils {
	public static void main(String[] args) {
		Set<Student> s = new HashSet<Student>();

		System.out.println("-----Student-----");
		for (int i = 0; i < 20; i++) {
			String id = getRandomString(8);
			System.out.print(id+" ");
			Student student = new Student(id);
			s.add(student);
		}
		System.out.println();
		TreeSet<Student> treeSet = new TreeSet<Student>(s);
		System.out.println(treeSet);
	}
	
	static String getRandomString(int length){
	     String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	     Random random=new Random();
	     StringBuffer sb=new StringBuffer();
	     for(int i=0;i<length;i++){
	    	 int number=random.nextInt(str.length());
	    	 sb.append(str.charAt(number));
	     }
	     return sb.toString();
	 }
}
