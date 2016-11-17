import java.util.Scanner;
public class exercici16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);
		x=0;
		y=0;
		//Bloc de codi principal
		System.out.println("Entra el Primer número:");
		x=entrada.nextInt();
		System.out.println("Entra el Segon número:");
		y=entrada.nextInt();
		if(x>y)
			{ System.out.println("El numero més gran és "  + x);
			}
		else
			{ if(x==y) {
				System.out.println("Són iguals");
				}

				else {
					 System.out.println("El numero més gran és "  + y);
					 
				}
			
		
		
			}
	}

}
