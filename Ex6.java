import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n = 20;
		int par = 20;
		int impar = 20;
		int vet[] = new int[n];
		int vetpar[] = new int[par];
		int vetimpar[] = new int[impar];
		int i;

		for (i = 0; i < n; i++) {
			System.out.println("Digite o número:");
			vet[i] = entrada.nextInt();
		}
		for (i = 0; i < n; i++) {
			System.out.print(vet[i] + "|");
		}
		System.out.println();
		for (i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				vetpar[i] = vet[i];

			}
			System.out.print("Par: " + vetpar[i]);
			System.out.println();
			for (i = 0; i < n; i++) {
				if (vet[i] % 2 != 0) {
					vetimpar[i] = vet[i];
				}

				System.out.print("Impar: " + vetimpar[i]);
			}

		}
		entrada.close();

	}

}
