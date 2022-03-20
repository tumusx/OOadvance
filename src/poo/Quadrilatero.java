package poo;

public class Quadrilatero {

	double calcularArea(double lado) {
		System.out.println ("quadrado");
		return lado*lado;
	}
	
	double calcularArea(double baseMaior, double baseMenor) {
		System.out.println("retangulo");
		return baseMaior*baseMenor;
	}
	
	double calcularArea(double baseMaior, double baseMenor, double altura) {
		System.out.println("triangulo");
		return ((baseMaior+baseMenor)*altura)/2;
	}
	
	double calcularArea(float diagonalMaior, float diagonalMenor) {
		System.out.println("losango");
		return diagonalMaior*diagonalMenor;
	}
	
	public static void main(String[]args) {
		Quadrilatero quadrt = new Quadrilatero();
		
		System.out.println (quadrt.calcularArea(9,7,5));
	}

}
