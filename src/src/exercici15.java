import java.util.Scanner;
public class exercici15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);
		x=0;
		//Bloc de codi principal
		System.out.println("Entra el numero:");
		x=entrada.nextInt();
		if(x>0)
			{ System.out.println("és positiu");
			}
		else
			{ if(x==0) {
				System.out.println("és neutre");
				}

				else {
					 System.out.println("és negatiu");
					
				}
			
		
		
			}
	}

}
