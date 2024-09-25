package exercicioscontador;

public class exercicioTabuada {

	public static void main(String[] args) {
		int n=1, i=1, r;
		
		while (n<11) {
			
			System.out.println("tabuada do" + i + ":");
			
			
			while(i<11) {
				
				r=n*i;
				
				System.out.println(n+"x"+i+"="+r);
				
				i++;
			}
			i--;
			n++;
		}
	}

}
