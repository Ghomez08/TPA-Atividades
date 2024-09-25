package lista1609;
import java.util.Scanner;

public class MaisVelhoNovoFor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, aa, an, id, maisVelho=0, maisNovo=0;
        System.out.print("Digite o ano atual: ");
        aa = ler.nextInt();

        for (i = 0; i < 10; i++) {  // Remove a duplicação da variável i
            System.out.print("Digite o ano de nascimento do usuário " + (i + 1) + ": ");
            an = ler.nextInt();  // Corrige o nome do scanner
            id = aa - an;

            System.out.println("Idade do usuário " + (i + 1) + ": " + id);

            if (id > maisVelho) {
                maisVelho = id;
            }
            if (id < maisNovo) {
                maisNovo = id;
            }
        }

        System.out.println("Idade do mais velho: " + maisVelho);
        System.out.println("Idade do mais novo: " + maisNovo);
        
        ler.close();
    }
}
