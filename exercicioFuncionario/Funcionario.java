package exercicioFuncionario;

public abstract class Funcionario {

	private String nome;
	private double salario;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	protected void listarDados() {
		System.out.println("Nome: " + nome + ", Salário: R$" + salario);
	};

	public String getNome(){
		return nome;
	}
	
	protected void setSalario(double salario) {
		this.salario = salario;
	}
};
