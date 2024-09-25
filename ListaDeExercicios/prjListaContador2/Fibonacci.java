package exercicioscontador;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int p = 1, nf=0, i=1, an=0, n, at=1;
		
		System.out.println("Escreva o numero:");
		n = ler.nextInt();
		
		while (i<=n) {
			
			System.out.println("A série do numero é" + p);
			
			p= an + at;
			
			an = at;
			
			at=p;
			
			i++;
			
		}
		
		ler.close();
		
	}

}
