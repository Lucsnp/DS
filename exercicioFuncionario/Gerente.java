package exercicioFuncionario;
import java.util.*;
public class Gerente extends Funcionario{

	
	Scanner in = new Scanner(System.in);	
	
		public Gerente(String nome){
		super(nome);
		
		setSalario(6800);
		}
		 
		 
		 void aprovarFolga() {
			// System.out.println("Qual funcionário recebera folga?");
			 System.out.println(getNome() + " aprovou uma folga.");
		 } 
}