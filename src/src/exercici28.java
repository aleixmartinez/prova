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
		
		if (nombre==nombrep)
		{ 		System.out.println("Primer nombre l'has encertat");
		}
		if (nombre<nombrep)
		{ 		System.out.println("El primer nombre introduit es mes gran que el pensat");
		}
		if (nombre>nombrep)
		{ 		System.out.println("El primer nombre introduit es mes petit que el pensat");
		}
		if (nombre==nombrep1)
		{ 		System.out.println("Segon nombre l'has encertat");
		}
		if (nombre<nombrep1)
		{ 		System.out.println("El primer nombre introduit es mes gran que el pensat");
		}
		if (nombre>nombrep1)
		{ 		System.out.println("El primer nombre introduit es mes petit que el pensat");
		}
		if (nombre==nombrep2)
		{ 		System.out.println("Tercer nombre l'has encertat");
		}
		if (nombre<nombrep2)
		{ 		System.out.println("El primer nombre introduit es mes gran que el pensat");
		}
		if (nombre>nombrep2)
		{ 		System.out.println("El primer nombre introduit es mes petit que el pensat");
		} System.out.println("El nombre correcte és:" +nombre);
	}	
}	
		