package prjListaExercicios;
import java.util.Scanner;
public class SucessorAntecessor {
	public static void main (String Args[]) {
		Scanner ler = new Scanner(System.in);
		int num, antecessor, sucessor;
		
		System.out.println("Digite o número desejado:");
		num = ler.nextInt();
		
		antecessor=num-1;
		
		sucessor=num+1;
		
		System.out.println("Antecessor:" +antecessor);
		
		System.out.println("Sucessor:" +sucessor);
		
		ler.close();
		
	}

}
