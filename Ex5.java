import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n = 10;
		char vet[] = new char[n];
		int i;
		int c = 0;

		for (i = 0; i < n; i++) {
			System.out.println("Digite um caracter:");
			vet[i] = entrada.next().charAt(0);
		}
		System.out.print("Consoantes: ");
		for (i = 0; i < n; i++) {
			if ((vet[i] != 'a') && (vet[i] != 'e') && (vet[i] != 'i') && (vet[i] != 'o') && (vet[i] != 'u')) {
			
			
			c++;
			
			System.out.print(vet[i] + " | ");
		}}
		for (i = 0; i < n; i++) {

		
		}System.out.println("O numero de consoantes é:" + c);

		entrada.close();

	}
}
