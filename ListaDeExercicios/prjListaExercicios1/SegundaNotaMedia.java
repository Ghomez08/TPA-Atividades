package prjListaExercicios;
import java.util.Scanner;
public class SegundaNotaMedia {
	public static void main (String Args[]) {
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, media;
		
		System.out.println("Digite o primeiro valor de nota:");
		n1 = ler.nextDouble();
		
		System.out.println("Digite o segundo valor de nota:");
		n2 = ler.nextDouble();
		
		System.out.println("Digite o terceiro valor de nota:");
		n3 = ler.nextDouble();
		
		media=(n1+n2+n3)/3;
		
		System.out.println("Sua média:" +media);
		
		ler.close();
		
	}

}
