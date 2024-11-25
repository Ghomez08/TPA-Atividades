package lista0411;
import java.util.Scanner;
public class RelacaoDivisores {
	public static void main(String[] Args) {
		Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], i, j;
        a = new int[TAM];

        for (i=0; i<TAM; i++) {
            System.out.println("Digite o "+(i+1)+"º valor");
            a[i] = in.nextInt();
        }
        
        
        for (i=0; i<TAM; i++) {
        	System.out.println("Divisores de " +(a[i]));
        	
        	for (j=1; j<=a[i]; j++) {
        		if (a[i]%j==0){
        			System.out.println(j+" ");
        		}
        	}
            
        }
        
        in.close();
    }
    
}
