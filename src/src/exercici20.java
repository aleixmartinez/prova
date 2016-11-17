import java.util.Scanner;
public class exercici20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, z, p, min;

		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);
		x=0;
		y=0;
		z=0;
		p=0;
		min=0;
		//Bloc de codi principal
		System.out.println("Entra la X:");
		x=entrada.nextInt();
		System.out.println("Entra la Y:");
		y=entrada.nextInt();
		System.out.println("Entra la Z:");
		z=entrada.nextInt();
		System.out.println("Entra la P:");
		p=entrada.nextInt();

		if((x<z)&&(x<y)&&(x<p))
			{ 	min=x;
			}
		else
			{ if((y<x)&&(y<z)&&(y<p)) {
				min=y;
				}

				else { if((z<x)&&(z<y)&&(z<p)) {
					min=z;
					
				}
					else { 
						min=p;
						
					}
			}
		} System.out.println(min);
	}
}