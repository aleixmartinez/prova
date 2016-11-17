import java.util.Scanner;
public class exercici28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre=(int)(Math.random()*10);
		int nombrep, nombrep1, nombrep2;
		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);	
		nombrep=0;
		nombrep1=0;
		nombrep2=0;
		//Bloc de codi principal
		System.out.println("El ordiandor ja té el numero aleatori:");
		System.out.println("Introdiu el nombre, podeu elegir 3 nombres:");
		nombrep=entrada.nextInt();
		nombrep1=entrada.nextInt();
		nombrep2=entrada.nextInt();
		
		if (nombre==nombrep || nombre==nombrep2 || nombre==nombrep1)
		{ 		System.out.println("has encertat");
		}
		else 
		{ 	System.out.println("has fallat");
		}
		System.out.println("el nombre correcte és:" +nombre);
	}	
}	
		