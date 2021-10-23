import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int n=10;
		float vet[] = new float[n];
		int i;
		
		for (i=0; i<n;i++) {
			System.out.println("Digite o número:");
			vet[i]= entrada.nextInt();
		}
		for (i=9; i>=0;i--) {	
		System.out.print(vet[i] + "|");
	}
        entrada.close();


	}

}

