package test2;
import java.util.Random;
import java.util.TreeMap;

public class SortUtils {
	public static void main(String[] args) {
		TreeMap<Teacher,String> t = new TreeMap<Teacher,String>();

		System.out.println("-----Teacher-----");
		for (int i = 0; i < 20; i++) {
			String id = getRandomString(8);
			System.out.print(id+" ");
			Teacher teacher = new Teacher(id);
			t.put(teacher,id);
		}
		System.out.println();
		System.out.println(t);
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

