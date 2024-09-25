package lista1609;
import java.util.Scanner;
public class PesoIdeal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, genero;
        double altura, PesoIdeal;

        do {
            System.out.println("Digite o sexo (1 para masculino, 2 para feminino): ");
            genero = ler.nextInt(); 
            
            System.out.println("Digite sua altura em centímetros: ");
            altura = ler.nextDouble(); 
            
            if (genero == 1) {
                PesoIdeal=52+(0.75*(altura-152.4));  
                System.out.println("O seu peso ideal é "+PesoIdeal+" kg");
            } else if (genero == 2) {
                PesoIdeal = 52 + (0.67 * (altura - 152.4));  
                System.out.println("O seu peso ideal é "+PesoIdeal+" kg");
            } else {
                System.out.println("Gênero inválido.");
            }
            
            System.out.println("Deseja continuar a execução? (Digite 1 para SIM, ou 2 para NÃO): ");
            i = ler.nextInt(); 
            
        } while (i == 1);

        ler.close();
    }
}
