import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira palavras de entrada separadas por ; : ");

		String palavras = entrada.nextLine();

		String s[] = palavras.split(";");

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		entrada.close();

	}

}
