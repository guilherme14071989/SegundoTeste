package Teste2;

public class Teste2 {

	public static void main(String[] args) {

		// String nome = "Guilherme Cardoso";
		// String cpf = "373.004.108-80";
		// String telefone = "(12)991569775";
		// String endereco = "Rua Teresina, 54";
		// int idade = 33;

		// String saida = "Meu nome � = " + nome + " minha idade � : " + idade +
		// " e o CPF � = " + cpf + " meu telefone � : " + telefone +
		// " e meu endere�o � : " + endereco;

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
			System.out.println("Voc� esta em recupera��o: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);
		}

	}

}
