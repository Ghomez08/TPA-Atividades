package lista0411;
import java.util.Scanner;
public class ParesBinarios {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i, j;
		a = new int[TAM];
		b = new int[TAM];
	
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "º valor:");
			a[i] = in.nextInt();

		}
		
		j=0; 
		
		for (i=0; i<TAM; i++) {
			if (a[i]%2 == 0) {
				b[j] = 1; 
				j++;
			} else {
				b[j]= 0;
				j++;
			}

		}
		System.out.print("Resultado:");
		for (i=0; i<TAM; i++) {
			System.out.print(" " +b[i]);
		}
		
		in.close();
	}
}
