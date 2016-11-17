import java.util.Scanner;
public class exercici21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, z;

		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);
		x=0;
		y=0;
		z=0;
		
		//Bloc de codi principal
		System.out.println("Entra la X:");
		x=entrada.nextInt();
		System.out.println("Entra la Y:");
		y=entrada.nextInt();
		System.out.println("Entra la Z:");
		z=entrada.nextInt();

		if((x>=y)&&(y>=z))
			{ System.out.println(x+", "+y+", "+z);
			}
			else
			{ if((x>=z)&&(z>=y)) {
				System.out.println(x+", "+z+", "+y);
				}
			
			else
			{ if((y>=x)&&(x>=z)) {
				System.out.println(y+", "+x+", "+z);
				}
			else
			{ if((y>=z)&&(z>=x)) {
				System.out.println(y+", "+z+", "+x);
				}
			else
			{ if((z>=x)&&(x>=y)) {
				System.out.println(z+", "+x+", "+y);
				}
			else
			{ if((z>=y)&&(y>=x)) {
				System.out.println(z+", "+y+", "+x);
				}

				
				
						}
					}
				}
			}
		}
	}
}