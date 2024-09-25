package exercicioscontador;

public class exerciciosAltura {
	public static void main(String[] args) {
		int i=0;
		double p=145, j=134, aJ, aP;
		
		aP=145;
		aJ=134;
		
		while(j<p) {
			p=aP+(2*i);
			j=aJ+(2.5*i);
			
			i++;
		}
		System.out.println("o João ultrapassará Pedro depois de: "+i+" anos. ");
	}

}
