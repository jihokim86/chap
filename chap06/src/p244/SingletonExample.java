package p244;

public class SingletonExample {

	public static void main(String[] args) {
//싱글톤 객체
		
//		 Singleton obj1 = new Singleton(); 에러
//		 Singleton obj2 = new Singleton(); 에러
		 
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다");
		}else {
			System.out.println("다른 Singleton 객체 입니다");
		}
		
	}

}
