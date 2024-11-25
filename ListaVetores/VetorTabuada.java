package lista0411;
import java.util.Scanner;
public class VetorTabuada {
	public static void main (String [] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=5;
		int a[], i, j;
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ " º valor de A.");
			a[i] = in.nextInt();
		}
		
		
		System.out.println("Tabuadas");
		for (i=0; i<TAM; i++){
			System.out.println("Tabuada de " +a[i]);
            for (j=1; j<=10; j+=1) {
            	 System.out.println(a[i] + "x" +j+ "=" + (a[i]*j));
            }
		}
		
		in.close();
	}

}
