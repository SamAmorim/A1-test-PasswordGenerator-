import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// atribuição nome
		String nome;
		Scanner input = new Scanner(System.in);

		System.out.print("digite o seu nome: ");
		nome = input.nextLine();

		String nomeFinal = nome.charAt(0) + "" + nome.charAt(2);

		// Atribuicao de cpf
		String cpf = null;

		System.out.print("digite seu cpf: ");
		cpf = input.nextLine();

		//conversão de STRING em ARRAY
		int cpfInt, somaCpf = 0;
		int[] cpfArray = new int[cpf.length()];
		
		for (int i = 0; i < cpf.length(); i++) {
			char cpfChar = cpf.charAt(i);
			cpfInt = Character.getNumericValue(cpfChar);
			cpfArray[i] = cpfInt;
		}
		//acumulador soma do cpf
		
		for (int i = 0; i< cpfArray.length; i++) {
			somaCpf += cpfArray[i];
		}
	
		//divisao inteira
		int divisaoCpf = cpfArray[2] % cpfArray[5];
		System.out.println(divisaoCpf);
		if(divisaoCpf == 0) {
			
			divisaoCpf = 1 + cpfArray[6];
		}
		System.out.println(divisaoCpf);
		String chave = nomeFinal + "" + somaCpf + "-" + divisaoCpf;
		
		System.out.println(chave);
	
	}

}
