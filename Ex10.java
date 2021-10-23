import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe uma mensagem: ");
		String m = entrada.nextLine();

		char[] l = m.toCharArray();

		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
		}

		entrada.close();

	}

}
