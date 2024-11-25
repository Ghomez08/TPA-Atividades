package lista0411;
import java.util.Scanner;
public class VetorBusca {
	public static void main (String Args[]) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], i, busca=0, pesquisa=0;
		a = new int [TAM];

		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ " º Valor de A");
			a[i]= in.nextInt();
		}
		
		System.out.println("Digite o valor que deseja buscar");
		pesquisa = in.nextInt();
		
		for (i=0; i<TAM; i++) {
			if (a[i]==pesquisa) {
				busca=a[i];
			}
			
		}
		
		if (busca==pesquisa) {
			System.out.println("O número " +busca+ " foi encontrado!");
		} else {
			System.out.println("O número " +pesquisa+ " não foi encontrado!");
		}
		
		in.close();
	}
	

}
