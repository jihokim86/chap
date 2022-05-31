package p728;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database"); // 2번으로 들어감 위에것이 3번으로 밀려남
		list.add("iBATIS");
		
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : "+skill);
		System.out.println();
		
		for(int i=0 ; i<list.size() ;i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		
		for(int i=0 ; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}

}
