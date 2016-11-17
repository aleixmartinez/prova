import java.util.Scanner;
public class exercici18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		int z;
		int p;
		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);
		x=0;
		y=0;
		z=0;
		p=0;
		//Bloc de codi principal
		System.out.println("Entra els dos primers numeros:");
		x=entrada.nextInt();
		y=entrada.nextInt();
		System.out.println("Entra els dos ultims numeros:");
		z=entrada.nextInt();
		p=entrada.nextInt();
		if((x+y)>(z+p))
			{ System.out.println("la suma dels dos primers és més gran que la suma dels dos ultims numeros");
			}
		else
			{ if((x+y)==(z+p)) {
				System.out.println("la suma dels dos primers és igual que la suma dels dos ultims numeros");
				}

				else {
					 System.out.println("la suma dels dos primers és més petit que la suma dels dos ultims numeros");
					
				}
			
		
		
			}
	}

}
