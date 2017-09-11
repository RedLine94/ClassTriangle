package ru.mail.redlin94;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	
	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public Triangle() {
		super();
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	public double getArea() {
		double semiperimetr = (sideA + sideB + sideC) / 2;
		return Math.pow((semiperimetr*(semiperimetr-sideA)*(semiperimetr-sideB)*(semiperimetr-sideC)), 0.5);
	}


	@Override
	public String toString() {
		return "Triangle [sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}
	
}
