import java.util.Scanner;
public class exercici30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, min;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		System.out.println("Introdueix el valor de A");
		a=entrada.nextInt();
		System.out.println("Introdueix el valor de B");
		b=entrada.nextInt();
		System.out.println("Introdueix el valor de C");
		c=entrada.nextInt();
	
		if (a>b && b<c) { min=b;
				
		}
		if (a<b && a<c) { min=a;
				
		}
		if (c<b && c<a) { min=a;
				
		}
		
		System.out.println("El valor més petit és" + min);
	
	}

}
