package exercicioFiguraGeometrica;

public abstract class CalculoArea {

	private double altura, base;
	protected double area;

	public double getAltura() {
		return altura;
	}

	public double getBase() {
		return base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public abstract void calcularArea();

}

class Quadrado extends CalculoArea {

	@Override
	public void calcularArea() {

		area = getBase() * getBase();
		System.out.println("Área do quadrado: " + area);
	}
}

class Retangulo extends CalculoArea {

	@Override
	public void calcularArea() {
		area = getBase() * getAltura();
		System.out.println("Área do retângulo: " + area);
	}
}

class Triangulo extends CalculoArea {

	@Override
	public void calcularArea() {
		area = (getBase() * getAltura()) / 2;
		System.out.println("Área do triângulo: " + area);
	}
}
