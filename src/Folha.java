import javax.swing.JOptionPane;

public class Folha {
	
	public static void main(String args[]) {
		
		Funcionario lista[];
		
		lista = new Funcionario[10];
		
		lista[0] = new Funcionario(111, "Thiago", "Junior",1000);
		lista[1] = new Funcionario(222, "Heloisa", "Pleno",2000);
		lista[2] = new Funcionario(333, "Errrrou", "Mané",0);
		lista[3] = new Funcionario(333, "Fabiano", "Senior",3000);
		lista[4] = new Funcionario(444, "Diego", "Pleno",1000);
		lista[5] = new Funcionario(555, "Vivian", "Senior",2000);
		lista[6] = new Funcionario(666, "Juliana", "Junior",3000);
		lista[7] = new Funcionario(777, "Leoncio", "Senior",1000);
		lista[8] = new Funcionario(888, "Anilda", "Pleno",2000);
		lista[9] = new Funcionario(999, "Chucrute", "Junior",0);
		
		for(int i = 0; i <= 9 ; i++) {
			System.out.println("Registro:"+ lista[i].getNumReg());
			System.out.println("Nome:"+ lista[i].getNome());
			System.out.println("Função:"+ lista[i].getFuncao());
			System.out.println("Salário Bruto:"+ lista[i].getSalarioBruto());
			System.out.println("Imposto:"+ lista[i].calcularImposto());
			System.out.println("Salário Liquido:"+ (lista[i].getSalarioBruto() - lista[i].calcularImposto())+ "\n");
		}
		
		
		
		
				
		//acervo[0] = new Livro("Livro1", "Thiago", 1984, "Gente Boa", 3, true);
		
		
	}

}
