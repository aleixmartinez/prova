import java.util.Scanner;
public class exercici22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, a, b;

		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);
		x=0;
		a=0;
		b=0;
		
		//Bloc de codi principal
		System.out.println("Entra el valor A:");
		a=entrada.nextInt();
		System.out.println("Entra el valor B:");
		b=entrada.nextInt();
	
		
		if (b==0)		
		{ 	System.out.println("No es pot fer?");
		
		}
		else x=(10*a)/b; {
				System.out.println("Resultat:");
				System.out.println(x);
		}

	}	
}		
		
		
			
		 
