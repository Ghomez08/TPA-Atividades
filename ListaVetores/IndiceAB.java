package lista0411;
import java.util.Scanner;
public class IndiceAB {
    public static void main(String Args[]) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], i, j;
        a = new int[TAM];
        b = new int[TAM];
        
        for (i=0; i<TAM; i++){
        	System.out.println("Digite o " +(i+1)+ "º valor");
        	a[i] = in.nextInt();
        }
        
        for (i=0; i<TAM; i++){
        	b[i]=0;
        	
        	for (j=i; j<TAM; j++) {
        		b[i]=a[j]+b[i];
        	}
        	
        	
        }
        
        for (i=0; i<TAM; i++) {
    		System.out.println((i+1)+"º valor = " +b[i]);
    	}
        
    }
}
