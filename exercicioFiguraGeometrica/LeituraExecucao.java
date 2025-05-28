package exercicioFiguraGeometrica;

import java.util.Scanner;

public class LeituraExecucao {

	private Scanner in = new Scanner(System.in);
	private int escolha;
	private double base, altura;
	
	public void execute(){

	System.out.print("Digite a figura para calcular a área:\n 1-Quadrado;\n 2-Retângulo;\n 3-Triângulo;");
	escolha = in.nextInt();


	switch (escolha) {
	case 1:
		System.out.print("Digite o valor da base do quadrado: ");
		base = in.nextDouble();

		Quadrado quadrado = new Quadrado();
		quadrado.setBase(base);
		quadrado.calcularArea();
		break;

	case 2:
		System.out.print("Digite o valor da base do retângulo: ");
		base = in.nextDouble();
		
		System.out.print("Digite o valor da altura do retângulo: ");
		altura = in.nextDouble();
		
		Retangulo retangulo = new Retangulo();
		retangulo.setBase(base);
		retangulo.setAltura(altura);
		retangulo.calcularArea();
		break;

	case 3:
		System.out.print("Digite o valor da base do triângulo: ");
		base = in.nextDouble();
		
		System.out.print("Digite o valor da altura do triângulo: ");
		altura = in.nextDouble();
		
		Triangulo triangulo = new Triangulo();
		triangulo.setBase(base);
		triangulo.setAltura(altura);
		triangulo.calcularArea();
		break;

	default:
		System.out.println("Opção inválida.");
	}

	in.close();}
}
