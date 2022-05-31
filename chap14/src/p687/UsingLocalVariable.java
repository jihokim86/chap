package p687;

public class UsingLocalVariable {
	
	
	void method(int arg) {
		int localVar = 40;
		
		//람다식
		MyFunctionalInterface fi = () -> {
			System.out.println("arg : " + arg);
			System.out.println("localVar : "+ localVar+ "\n");
		};
		
		fi.method();
	}

}

