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
		System.out.println("Entra el Primer n�mero:");
		x=entrada.nextInt();
		System.out.println("Entra el Segon n�mero:");
		y=entrada.nextInt();
		if(x>y)
			{ System.out.println("El numero m�s gran �s "  + x);
			}
		else
			{ if(x==y) {
				System.out.println("S�n iguals");
				}

				else {
					 System.out.println("El numero m�s gran �s "  + y);
					 
				}
			
		
		
			}
	}

}
