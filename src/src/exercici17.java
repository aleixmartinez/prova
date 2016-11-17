import java.util.Scanner;
public class exercici17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, p, q;
		
		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);
	
		//Bloc de codi principal
		System.out.println("Entra els dos primer numeros:");
		x=entrada.nextInt();
		y=entrada.nextInt();
		System.out.println("Entra els dos primer numeros:");
		p=entrada.nextInt();
		q=entrada.nextInt();
		
		if(x+y > p+q)
			{ 	
				System.out.println("la suma de x+y = " + (x+y) + " es mes gran que p+q = " + (p+q) );
			}
		if(x+y < p+q)
		{ 	
			System.out.println("la suma de x+y = " + (x+y) + " es mes petit que p+q = " + (p+q) );
		}
		if(x+y == p+q)
		{ 	
			System.out.println("la suma de x+y = " + (x+y) + " es igual que p+q = " + (p+q) );
		}
	}
}

