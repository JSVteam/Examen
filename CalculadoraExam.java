package Examen;

public class CalculadoraExam {

	private int num1;
	private int num2;

	public CalculadoraExam(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public int divideix() {
		int resul = num1 / num2;
		return resul;
	}

	public int potencia() {
		int potencia = Math.multiplyExact(num1, num2);

		return potencia;

	}

	public boolean residu() {

		if (num1 % 2 == 0) {
			return true;
		} else {

			return false;
		}
	}

}
