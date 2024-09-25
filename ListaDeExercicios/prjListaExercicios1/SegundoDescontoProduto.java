package prjListaExercicios;
import java.util.Scanner;
public class SegundoDescontoProduto {
	public static void main (String Args[]) {
		Scanner ler = new Scanner(System.in);
		double preco, desconto, valor;
		
		System.out.println("Digite o preço do produto:");
		preco = ler.nextDouble();
		
		System.out.println("Digite o valor do desconto:");
		desconto = ler.nextDouble();
		
		valor=preco-(desconto/100*preco);
		
		System.out.println("Valor com desconto adicionado:" +valor);
		
		ler.close();
	}

}
