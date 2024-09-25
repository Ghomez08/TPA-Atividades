package exercicioscontador;

public class Tabuada {

		public static void main(String[] args) {
			
			int i = 1;
			
			
			while (i <= 10) {
				
				System.out.println("tabuada do" + i + ":");
				
				
				int j=1;
				
				
				while(j <= 10) {
					
					System.out.println(i+"x"+j+"="+ (i * j));
					
					j++;
				}
				
				
				System.out.println();
				i++;
			}
		}
	}
