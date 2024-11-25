package lista0411;
import java.util.Scanner;
public class VetorIntersecao {
	public static void main (String Args[]) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], c[], i, j, k=0;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ " º Valor de A");
			a[i]= in.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ " º Valor de B");
			b[i]= in.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			c[i]=0;
			for (j=0; j<TAM; j++) {
				if (a[i]==b[j]){
					c[k]=a[i];
					k++;
				}
			}
			
		}
		
		System.out.print("\nC = ");
		for (i=0; i<k; i++){
			System.out.print(c[i]+" ");
		}
		
		in.close();	
	}

}
