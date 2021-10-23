import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int n = 5;
		int soma = 0;
		int mult = 1;
		int vet[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o número:");
			vet[i] = entrada.nextInt();
			soma = soma + vet[i];
			mult = mult * vet[i];
		}
		System.out.println();
		System.out.println("Soma: " + soma);
		System.out.println("Multiplicação: " + mult);
		for (int i = 0; i < n; i++) {
			System.out.print(vet[i] + " | ");
		}

		entrada.close();
	}

}
