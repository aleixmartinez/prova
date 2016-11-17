import java.util.Scanner;
public class exercici31prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int x;
	
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Introdiu el numero");
		x = entrada.nextInt();
	
		if (x<0) { System.out.println("El valor és negatiu");
			}
		else {
			if (x==0) { System.out.println("El valor és neutre");
			}
			else { System.out.println("El valor es positiu");
			
			}
		}

	}
}
