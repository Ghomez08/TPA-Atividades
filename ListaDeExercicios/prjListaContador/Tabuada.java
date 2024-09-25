package lista2608;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, r, i = 0;
        
        System.out.println("Digite o número que deseja a tabuada:");
        n = ler.nextInt();
        
        do {
            r = n * i;
            System.out.println(+n +"×" +i +"=" +r);
            i++;
        } while (i < 11);
        
        ler.close();
    } 
}