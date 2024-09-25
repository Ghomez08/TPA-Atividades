package lista2608;
import java.util.Scanner;
public class MaiorMenor {
	 public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
	     int aa, an, id, i = 0;
	        
	     do {
	        	
	    	 System.out.println("Digite o ano atual:");
	         aa = ler.nextInt();
	            
	         System.out.println("Digite o ano de nascimento:");
	         an = ler.nextInt();
	        	
	         id=aa-an;
	        	
	         if (id<18){
	        		System.out.println("Menor de idade: " +id);
	         } else {
	    			System.out.println("Maior de idade: " +id);
	         }
	        	
				i++;
				
	     } while (i<6);
	        
	     ler.close();
	 } 
}