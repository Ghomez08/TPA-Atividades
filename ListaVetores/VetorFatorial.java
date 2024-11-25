package lista0411;
import java.util.Scanner;
public class VetorFatorial {
	public static void main (String Args []) {
		Scanner in = new Scanner(System.in);
		final int TAM = 15;
	    int a[], b[], i, j, fatorial;
	    a = new int[TAM];
	    b = new int[TAM];
	    
	    for (i=0; i<TAM; i++) {
            System.out.println("Digite o "+(i+1)+"º valor");
            a[i] = in.nextInt();
        }
	    

        for (i=0;i<TAM; i++) {
        	
        	fatorial=1;
        	
        	for (j=1; j<=a[i]; j++) {
        		fatorial*=j;
        	}
        	
        	b[i]=fatorial;
        }
        
        for (i=0; i<TAM; i++) {
            System.out.println("Fatorial de "+a[i]+"é"+b[i]);
        }
	}

}
