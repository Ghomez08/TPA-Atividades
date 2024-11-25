package lista0411;
import java.util.Scanner;
public class VetorDiferença {
	public static void main (String Args[]) {
		Scanner in = new Scanner(System.in);
		final int TAM = 4;
		int a[], b[], c[], dif, i, j, k=0;
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
			dif=0;
			
			for (j=0; j<TAM; j++) {
				if (a[i]!=b[j]){
					dif++;
				}
			}
			
			if (dif==TAM) {
				c[k]=a[i];
				k++;
			}
			
		}
		
		System.out.print("\nNão existe em B: ");
		for (i=0; i<k; i++){
			System.out.print(c[i]+" ");
		}
		
		in.close();
		
	}

}