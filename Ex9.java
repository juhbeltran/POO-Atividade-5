import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		char c = 21;
		char v = 5;
		char consoantes[] = new char[c];
		char vogal[] = new char[v];
		char letras[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		String senha = "";
		int pos = 0;

		System.out.println("Informe uma quantidade de letras menor do que 26 para gerar a sua senha: ");
		int qtd = entrada.nextInt();
		for (int i = 0; i < qtd; i++) {
			if ((letras[i] == 'a') && (letras[i] == 'e') && (letras[i] == 'i') && (letras[i] == 'o')
					&& (letras[i] == 'u')) {
				vogal[i] = letras[i];
			} else {
				consoantes[i] = letras[i];
			}
		}
		for (int i = 0; i < qtd; i++) {

			pos = (int) (Math.random() * 26);

			senha = senha + consoantes[pos] + vogal[pos];
		}
		System.out.println(senha);

		entrada.close();
	}
}
