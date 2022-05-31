package p695;

public class Student {
	private String name;
	private int englichScore;
	private int mathSore;
	
	public Student(String name, int englichScore, int mathSore) {
		this.name = name;
		this.englichScore = englichScore;
		this.mathSore = mathSore;
	}

	public String getName() { return name; 	}

	public int getEnglichScore() { return englichScore;	}

	public int getMathSore() { return mathSore;	}
	
}
