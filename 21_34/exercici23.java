import java.util.Scanner;
public class exercici23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		double valor3, valor2, valor1, x1, x2;
		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);
		valor3=0;
		a=0;
		b=0;
		c=0;
		valor1=0;
		valor2=0;
		x1=0;
		x2=0;
		//Bloc de codi principal
		System.out.println("Entra el valor A:");
		a=entrada.nextInt();
		System.out.println("Entra el valor B:");
		b=entrada.nextInt();
	
		
		if (a==0 && b==0 && c==0)		
		{ 	System.out.println("No es pot fer?");
		
		}
		else 
		{ 	valor2=2*a;
			valor1=b+Math.sqrt((b*b)-4*a*c);
			valor3=b-Math.sqrt((b*b)-4*a*c);
			x1=-valor1/valor3;
			x2=-valor2/valor3;
		}
			System.out.println(x1);
			System.out.println(x2);
	}	
}		
		
		
			
		 

		
