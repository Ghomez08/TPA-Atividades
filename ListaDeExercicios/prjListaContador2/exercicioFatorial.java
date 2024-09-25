package exercicioscontador;

import java.util.Scanner;

public class exercicioFatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		     System.out.println("digite um número para calculra o seu fatorial:");
		     int n = ler.nextInt();
		     
		     int f = 1;
		     int i=n;
		     
		     while (i>=1) {
		    	 f=f*i;
		    	 i--;
		     }
		     
		     System.out.println("fatorial de" + n + "é" + f);

	}

}
