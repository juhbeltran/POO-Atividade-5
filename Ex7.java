import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		final int n = 5;
		int vetn[] = new int[n];
		final int m = 10;
		int vetm[] = new int[m];
		int num = 0;

		for (int i = 1; i < m; i++) {
			for (int x = 1; x < n; x++) {
				System.out.println("Digite a nota " + x + " do aluno " + i);
				vetn[x] = entrada.nextInt();
				vetm[i] = vetm[i] + vetn[x];
			}

			if ((vetm[i] / 4) >= 7) {
				num++;
			}
		}
		System.out.println("São" + num + " com média acima ou igual a 7");
		entrada.close();

	}
}
