package p743;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"),95);
		map.put(new Student(1, "홍길동"),95);
		System.out.println("총 Entry : "+map.size());
		System.out.println(map.get(false));
	}

}
