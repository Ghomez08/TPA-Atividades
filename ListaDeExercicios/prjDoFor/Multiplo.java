package lista1609;
public class Multiplo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);  // Usando print para otimizar a exibição
            if (i % 10 == 0) {
                System.out.println(" - múltiplo de 10");
            } else {
                System.out.println();  // Quebra de linha para os outros números
            }
        }
    }
}
