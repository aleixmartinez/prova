import java.util.Scanner;
public class exercici25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota;
		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);
		nota=0;
		
		
		//Bloc de codi principal
		System.out.println("Entra la nota:");
		nota=entrada.nextDouble();
		
		if (nota>=9 && nota<=10)
		{ 		System.out.println("Tens un Excel·lent");
		}
		if (nota<9 && nota>=6.5)
		{ 		System.out.println("Tens un Notable");
		}
		if (nota>=5 && nota<6.5)
		{ 		System.out.println("Tens un Suficient");
		}
		if (nota<5)
		{
		System.out.println("Has Suspes");
				}
			}	
		}	
		
