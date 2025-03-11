import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Calc calc = new Calc();

		System.out.println("Digite a conta a ser feita(use espaço após números e sinais de operações):");
		double a = in.nextDouble();
		String sinal = in.next();
		double b = in.nextDouble();

		switch (sinal) {
		case "+":
			calc.somar(a, b);
			break;
		case "-":
			calc.subtrair(a, b);
			break;
		case "x":
		case "*":
		case "X":
			calc.multiplicar(a, b);
			break;
		case "/":
		case "÷":
			calc.dividir(a, b);
		default:
			;
		}

		System.out.printf("Resultado: %.2f", calc.resultado);
		in.close();
	}
}
