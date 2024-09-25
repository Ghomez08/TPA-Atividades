package prjListaExercicios;
import java.util.Scanner;
public class SomaTresNumeros {
	public static void main (String Args[]) {
		Scanner ler = new Scanner(System.in);
		int valor1, valor2, valor3, resultado;
		
		System.out.println("Digite o primeiro valor:");
		valor1 = ler.nextInt();
		
		
		System.out.println("Digite o segundo valor:");
		valor2 = ler.nextInt();
		
		System.out.println("Digite o terceiro valor:");
		valor3 = ler.nextInt();
		
		resultado=(valor1*valor1)+(valor2*valor2)+(valor3*valor3);
		
		System.out.println("Resultado:" +resultado);
		
		ler.close();
		
	}
}
