import java.util.Scanner;
public class exercici24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int costat1, costat2, resultatarea, resultatper;
		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);
		costat1=0;
		costat2=0;
		resultatarea=0;
		resultatper=0;
		
		//Bloc de codi principal
		System.out.println("Entra el valor del costat numero 1:");
		costat1=entrada.nextInt();
		System.out.println("Entra el valor del costat numero 2:");
		costat2=entrada.nextInt();
		System.out.println("Entra el que vols calcuar Perimetre(P), Area(A)");
		String opcio=entrada.next();
		
		
		if (opcio.equalsIgnoreCase("A"))
		{ 	resultatarea=costat1*costat2;
			System.out.println(resultatarea);
		}
		if (opcio.equalsIgnoreCase("P"))
		{ 	resultatper=(2*costat1)*(2*costat2);
			System.out.println(resultatper);
		}
		
	}	
}		
		
		
			
		 