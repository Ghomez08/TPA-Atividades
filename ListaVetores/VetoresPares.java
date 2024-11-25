package lista0411;
import java.util.Scanner;
public class VetoresPares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i, par=0;
		a = new int[TAM];
		b = new int[TAM];
	
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "º valor:");
			a[i] = in.nextInt();

			if (a[i]%2 == 0) {
				b[par] = a[i]; 
				par++; 
			}
		}
		System.out.print("\nPares): ");
		for (i=0; i<par; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("\nImpares: ");
		for (i=0; i<TAM; i++) {
			if (a[i]%2 != 0) 
				System.out.print(a[i] + " ");
			}
		in.close();
		}
	}
