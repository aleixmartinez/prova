import java.util.Scanner;
public class exercici19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, z, min;

		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);
		x=0;
		y=0;
		z=0;
		min=0;
		//Bloc de codi principal
		System.out.println("Entra la X:");
		x=entrada.nextInt();
		System.out.println("Entra la Y:");
		y=entrada.nextInt();
		System.out.println("Entra la Z:");
	if((x<z)&&(x<y))		z=entrada.nextInt();
	
			{ 	min=x;
			}
		else
			{ if((y<x)&&(y<z)) {
				min=y;
				}

				else {
					min=z;
					
				}
			
		
		
			} System.out.println(min);
		} 
}