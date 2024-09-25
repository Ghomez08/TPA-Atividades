package prjListaExercicios;
import java.util.Scanner;
public class DescontoProduto {
	public static void main (String Args[]) {
		Scanner ler = new Scanner(System.in);
		double preco, desconto, precoFinal;
		
		System.out.println("Digite o preço do produto:");
		preco = ler.nextDouble();
		
		desconto=preco/100*5;
		precoFinal=preco-desconto;
		
		System.out.println("Valor do produto com desconto de 5%:" +precoFinal);
		
		ler.close();
		
	}

}
