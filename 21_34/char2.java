import java.util.Scanner;
public class char2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char lletra=' ';
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Introduiu un caracter");
		lletra = entrada.next().charAt(0);
		
		if (Character.isLetter(lletra)) {
		
				if (Character.isUpperCase(lletra)) { 
					System.out.println("Es Majuscula");
				}
				if (Character.isLowerCase(lletra)) { 
					System.out.println("Es Minuscula");
				}
		
		}
		else { System.out.println("ERROR!");
		
			}
		}
	

}