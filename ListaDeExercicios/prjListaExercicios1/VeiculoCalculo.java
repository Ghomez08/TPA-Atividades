package prjListaExercicios;
import java.util.Scanner;
public class VeiculoCalculo {
	public static void main (String Args[]) {
		Scanner ler = new Scanner(System.in);
		double valor, ipva;
		
		System.out.println("Digite o preço do veículo:");
		valor = ler.nextDouble();
		
		ipva=(valor/100)*4;
		
		System.out.println("Valor do ipva:" +ipva);
		
		ler.close();
	}

}
