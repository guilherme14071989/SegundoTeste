package Teste2;

public class Teste2 {

	public static void main(String[] args) {

		// String nome = "Guilherme Cardoso";
		// String cpf = "373.004.108-80";
		// String telefone = "(12)991569775";
		// String endereco = "Rua Teresina, 54";
		// int idade = 33;

		// String saida = "Meu nome é = " + nome + " minha idade é : " + idade +
		// " e o CPF é = " + cpf + " meu telefone é : " + telefone +
		// " e meu endereço é : " + endereco;

		// System.out.println(saida);

		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 10;
		int nota4 = 30;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Você esta em recuperação: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}

	}

}
