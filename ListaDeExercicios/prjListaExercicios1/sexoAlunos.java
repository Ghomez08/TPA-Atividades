package prjListaExercicios;
import java.util.Scanner;
public class sexoAlunos {
	public static void main (String Args[]) {
		Scanner ler = new Scanner(System.in);
		int masculino, feminino, porcentagemM, porcentagemF;
		
		System.out.println("Digite a quantidade de alunos do sexo masculino:");
		masculino = ler.nextInt();
		
		System.out.println("Digite a quantidade de alunos do sexo feminino:");
		feminino = ler.nextInt();
		
		porcentagemM=100*masculino/(masculino+feminino);
		
		porcentagemF=100*feminino/(feminino+masculino);
		
		System.out.println("Porcentagem de meninos:" +porcentagemM);
		
		System.out.println("Porcentagem de meninas:" +porcentagemF);
		
		ler.close();
		
	}

}
