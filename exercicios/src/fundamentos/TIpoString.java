package fundamentos;

public class TIpoString {

	public static void main(String[] args) {
     
	System.out.println("Olá Pessoal".charAt(2));
		
	String s = "Bom dia";
	System.out.println(s.concat(" !!! "));
	System.out.println(s + " !!! ");
	System.out.println(s.startsWith("Boa"));
	System.out.println(s.toLowerCase().startsWith("boa"));
	
	var nome = "Pedro";
	var sobrenome = "Santos";
	var idade = 33; 
	var salario = 12540.90;
	
	System.out.println("Nome:" + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n" );
	System.out.printf("O Senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
	

	
	}
}
