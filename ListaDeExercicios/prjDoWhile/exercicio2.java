package execiciopeso;
 
import java.util.Scanner;

public class exercicio2 {

		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			
				double A, P;
				String Sexo;
				String resposta;
				
				do {
					System.out.println("Informe seu sexo (M/F):");
					Sexo = ler.next();
					
					System.out.println("Informe a sua altura ");
					A = ler.nextDouble();
					
					if (Sexo.equalsIgnoreCase ("M")) {
						P  = 52+(0.75*(A-152.4));
						
						System.out.println("Seu Peso ideal é:" + P);
						}
			 
					else if (Sexo.equalsIgnoreCase ("F")) {
						P  = 52+(0.67*(A-152.4));
						
						System.out.println("Seu Peso ideal é:" + P);
						} 
					else { 
						System.out.println("Sexo inválido");
					}
					System.out.println("Deseja continuar a execução? 1 para Sim ou 2 para Não");
					resposta = ler.next();
				}while(resposta.equalsIgnoreCase("1"));
				ler.close();


	}

}
