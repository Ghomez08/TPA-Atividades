package prjListaExercicios;
import java.util.Scanner;
public class AnoNascimento {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int n, a, idade;
		
		System.out.println("Digite o ano de nascimento:");
		n = ler.nextInt();
		
		System.out.println("Digite o ano atual:");
		a = ler.nextInt();
		
		idade=a-n;
		
		System.out.println("Sua idade é:" + idade);
		
		ler.close();
	}

}
