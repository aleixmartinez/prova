import java.util.Scanner;
public class exercici31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String J1;
		String J2;
		
		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);	

		//Bloc de codi principal
		System.out.println("Jugador 1, que vols, pedra || paper || tissora?");
		J1=entrada.next();
		System.out.println("Jugador 2, que vols, pedra || paper || tissora?");
		J2=entrada.next();

		
		if (J1.equalsIgnoreCase("Paper") && J2.equalsIgnoreCase("Paper"))
		{ 		System.out.println("El J1 ha elegit Paper || El J2 ha elegit Paper: Empat.");
		}
		if (J1.equalsIgnoreCase("Tissora") && J2.equalsIgnoreCase("Tissora"))
		{ 		System.out.println("El J1 ha elegit Tissora || El J2 ha elegit Tissora: Empat.");
		}
		if (J1.equalsIgnoreCase("Pedra") && J2.equalsIgnoreCase("Pedra"))
		{ 		System.out.println("El J1 ha elegit Pedra || El J2 ha elegit Pedra: Empat.");
		}
		if (J1.equalsIgnoreCase("Pedra") && J2.equalsIgnoreCase("Paper"))
		{ 		System.out.println("El J1 ha elegit Pedra || El J2 ha elegit Paper: Guanya J2.");
		}
		if (J1.equalsIgnoreCase("Pedra") && J2.equalsIgnoreCase("Tissora"))
		{ 		System.out.println("El J1 ha elegit Pedra || El J2 ha elegit Tissora: Guanya J1.");
		}
		if (J1.equalsIgnoreCase("Tissora") && J2.equalsIgnoreCase("Paper"))
		{ 		System.out.println("El J1 ha elegit Tissora || El J2 ha elegit Paper: Guanya J1.");
		}
		if (J1.equalsIgnoreCase("Tissora") && J2.equalsIgnoreCase("Pedra"))
		{ 		System.out.println("El J1 ha elegit Tissora || El J2 ha elegit Pedra: Guanya J2.");
		}
		if (J1.equalsIgnoreCase("Paper") && J2.equalsIgnoreCase("Tissora"))
		{ 		System.out.println("El J1 ha elegit Paper || El J2 ha elegit Tissora: Guanya J2.");
		}
		if (J1.equalsIgnoreCase("Paper") && J2.equalsIgnoreCase("Pedra"))
		{ 		System.out.println("El J1 ha elegit Paper || El J2 ha elegit Pedra: Guanya J1.");
		}
	}	
	
}	
		