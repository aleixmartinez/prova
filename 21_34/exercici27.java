import java.util.Scanner;
public class exercici27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre=(int)(Math.random()*10);
		double nombrep;
		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);	
		nombrep=0;
		//Bloc de codi principal
		System.out.println("El ordiandor ja té el numero aleatori:");
		System.out.println("Introdiu el nombre:");
		nombrep=entrada.nextDouble();
		
		if (nombre==nombrep)
		{ 		System.out.println("has encertat");
		}
		else 
		{ 	System.out.println("has fallat");
		}
		System.out.println("el nombre correcte és:" +nombre);
	}	
}	
		