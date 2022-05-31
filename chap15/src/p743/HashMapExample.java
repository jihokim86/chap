package p743;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		//Map컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		// <키타입,값타입> 키는 중복 불가
		
		//객체저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 홍길동 키가 같기때문에 마지막 저장한 값으로 대치
		System.out.println("총 Entry 수 : "+ map.size()); // 저장된 총 Entry 수
		
		//객체찾기
		System.out.println("\t홍길동 : "+map.get("홍길동"));
		System.out.println();
		
		//객체를 하나씩 처리 41라인과 비교
		Set<String> keySet = map.keySet();
		Iterator<String> keyInterator = keySet.iterator();
		//이것의 의미가 무엇일까?
//		Iterator<String> keyInterator = new Iterator<>();
//		인터페이스는 객체생성이 불가능하지.
//		추상매소드는 구현을 해야한다.
		// 인터페이스 변수 = new 구현객체(); 로 이용해야한다.
		// 변수.hasNext() 이렇게 되어야 하지 않나?
		
		while(keyInterator.hasNext()) {
			String key = keyInterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":" + value);
		}
		System.out.println();
		
		//객체삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 :"+map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryInterator = entrySet.iterator();
		
		while(entryInterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryInterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : "+map.size());
	}

}
