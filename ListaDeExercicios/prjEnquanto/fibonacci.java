import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o número de termos desejados: ");
        int n, seq1 = 0, seq2 = 1, i = 1, proximo;

      
        while (i <= n) {
           
            System.out.println(seq1);   
            proximo = seq1 + seq2;
            seq1 = seq2;
            seq2 = proximo;

         
            i++;
        }

        
        	ler.close();
    	}
	}



