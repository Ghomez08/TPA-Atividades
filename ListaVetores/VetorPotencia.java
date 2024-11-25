package lista0411;
import java.util.Scanner;
public class VetorPotencia {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 11;
        int a[], i, j, base;
        a = new int[TAM];
        
        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o "+(i+1)+"º valor:");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            base = 2; 
            
            if (a[i]==0){
            	base=1;
            	
            } else {
            	
            	for (j = 1; j < a[i]; j++) {
                	base = base * 2;
                }
	
            }
            
            System.out.println("2 elevado a "+a[i]+" = "+base);
        }
        
        in.close();
        
    }
    
}