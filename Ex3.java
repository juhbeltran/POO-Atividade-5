 import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			int menor = 0;
			int maior = 0;
			int soma = 0;
			int media = 0;

			System.out.println("Digite o número da constante:");
			int n = entrada.nextInt();

			int vet[] = new int[n];
			int i;

			for (i = 0; i < n; i++) {
				System.out.println("Digite o número:");
				vet[i] = entrada.nextInt();

			}
			for (i = 0; i < n; i++) {
				if (vet[i] != maior || vet[i] != menor) {
					maior = vet[i];
					menor = vet[i];

				}
				for (i = 0; i < n; i++) {
				if (vet[i] > maior) {
					maior = vet[i];
				} else {
					menor = vet[i];

				}
				}
				for (i = 0; i < n; i++) {
					soma = soma + vet[i];
					media = soma / n;

					if (vet[i] % 2 == 0) {
						System.out.print( "Par: "+vet[i] + " | ");
					} else {
						System.out.print("Impar: " + vet[i] + " | ");

					}

				}
				System.out.println();
				System.out.println("Soma: " + soma);
				System.out.println("Média: " + media);
				System.out.println("Maior: " + maior);
				System.out.println("Menor: " + menor);
				entrada.close();

			}
		}
	}
}
