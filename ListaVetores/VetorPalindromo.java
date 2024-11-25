package lista0411;
import java.util.Scanner;
public class VetorPalindromo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], i;
		a = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o" +(i+1)+ "º valor");
			a[i] = in.nextInt();
		}
		
		if (a[0]!=a[9]) {
            System.out.println("O valor digitado não é um palíndromo.");
        } 
		
		else if (a[1]!=a[8]) {
            System.out.println("O valor digitado não é um palíndromo.");
        } 
		
		else if (a[2]!=a[7]) {
            System.out.println("O valor digitado não é um palíndromo.");
        } 
		
		else if (a[3]!=a[6]) {
            System.out.println("O valor digitado não é um palíndromo.");
        } 
		
		else if (a[4]!=a[5]) {
            System.out.println("O valor digitado não é um palíndromo.");
        } 
		
		else {
            System.out.println("O valor dígito é um palíndromo.");
        }
		
		in.close();
		
	}
	

}