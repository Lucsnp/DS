
public class Calc {

	double resultado;

	public double somar(double a, double b) {

		resultado = a + b;

		return resultado;
	}

	public double subtrair(double a, double b) {

		resultado = (a - b);

		return resultado;
	}

	public double multiplicar(double a, double b) {

		resultado = (a * b);

		return resultado;
	}

	public double dividir(double a, double b) {

		if (a != 0 && b != 0) {
			resultado = (a / b);
			return resultado;

		} else {
			return resultado = 0;
		}

	}
}
