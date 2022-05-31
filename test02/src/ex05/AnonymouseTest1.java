package ex05;

public interface Car {
	public void run();
	public void stop();
}

public abstract class AnonymouseTest1 implements Car{

	public static void main(String[] args) {
		Car fooCar = new Car() {
		
			public void run() {
				System.out.println("달려라!");
			}
			
			public void stop() {
				System.out.println("멈춰!!!");
			}
		
	    };
		
	    
	    fooCar.run();
	    fooCar.stop();
	}
}
