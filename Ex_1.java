import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int n=5;
		int vet[] = new int[n];
		int i;
		
		for (i=0; i<n;i++) {
			System.out.println("Digite o número:");
			vet[i]= entrada.nextInt();
		}
		for (i=0; i<n;i++) {	
		System.out.print(vet[i] + "|");
	}
        entrada.close();


	}

}
