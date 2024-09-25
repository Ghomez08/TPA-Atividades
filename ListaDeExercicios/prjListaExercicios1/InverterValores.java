package prjListaExercicios;
import java.util.Scanner;
public class InverterValores {
	public static void main (String Args[]) {
		Scanner ler = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Digite o primeiro valor:");
		a = ler.nextDouble();
		
		System.out.println("Digite o segundo valor:");
		b = ler.nextDouble();
		
		c = a;
	    a = b;
	    b = c;
	    
	    System.out.println("Primeiro valor:" +a);
	    
	    System.out.println("Segundo valor:" +b);
	    
	    ler.close();
	    
	}
	
}