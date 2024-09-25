package prjListaExercicios;
import java.util.Scanner;
public class ConversaoKm {
	public static void main (String Args[]) {
		Scanner ler = new Scanner(System.in);
		double metros, km;
		
		System.out.println("Digite a quantidade de metros:");
		metros = ler.nextDouble();
		
		km=metros/1000;
		
		System.out.println("Convertido para quilômetros:" +km);
		
		ler.close();
		
	}

}
