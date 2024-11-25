package lista0411;
import java.util.Scanner;
public class RelacaoPares {
    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], i, j;
        a = new int[TAM];

        for (i=0; i<TAM; i++) {
            System.out.println("Digite o "+(i+1)+"º valor");
            a[i] = in.nextInt();
        }

        for (i = 0; i<TAM; i++) {
            System.out.println("Pares do "+a[i]+"º valor: ");
            
            for (j=0; j<=a[i]; j+=2) {
                System.out.println(j+ " "); 
            }
 
        }
        in.close();
    }
    
}
