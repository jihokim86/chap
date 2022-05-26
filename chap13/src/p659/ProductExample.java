package p659;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>(); // 클래스를 타입으로 사용??
		
		product1.setKind(new Tv()); // 어떻게 활용됨?
		product1.setModel("스마트TV");
		
		Tv tv = product1.getKind(); // 어떻게 활용됨?
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<>(); // 클래스를 타입으로 사용??
		
		product2.setKind(new Car()); // 어떻게 활용됨?
		product2.setModel("디젤");
		
		Car car = product2.getKind(); // 어떻게 활용됨?
		String carmodel = product2.getModel();
	}

}
