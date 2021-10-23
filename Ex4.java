import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {

			int n = 4;
			float soma = 0;
			float media = 0;

			float vet[] = new float[n];
			int i;

			for (i = 0; i < n; i++) {
				System.out.println("Digite a nota:");
				vet[i] = entrada.nextInt();
			}
			for (i = 0; i < n; i++) {
				System.out.println("Nota: " + vet[i]);

				soma = soma + vet[i];
				media = soma / n;
			}
			System.out.println();

			System.out.println("Média: " + media);
			entrada.close();

		}
	}
}