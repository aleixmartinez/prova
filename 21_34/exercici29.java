import java.util.Scanner;
public class exercici29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=(int)(Math.random()*10);
		int nombrep, nombrep1, nombrep2;
		//Definim Entrada del tipus Scanner per poder llegir
		Scanner entrada;
		//Iniciem les variables
		entrada = new Scanner(System.in);	

		System.out.println("El ordiandor ja té el numero aleatori:");
		System.out.println("Introdiu el nombre, podeu elegir 3 nombres:");
		nombrep=entrada.nextInt();
		nombrep1=entrada.nextInt();
		nombrep2=entrada.nextInt();
		
		if 
		(nombrep==x || nombrep1==x || nombrep2==x){
			System.out.println("Has encenrtat. El número és " + x);
			
		}
		
		if (nombrep != x && nombrep1 != x && nombrep2 != x) {
			
			if (x>nombrep && x>nombrep1 && x>nombrep2) { System.out.println("El numero escollit per l'ordinador és més gran que " + nombrep + ", " + nombrep1 + " i " + nombrep2); }
			
			if (x>nombrep && x>nombrep1 && x<nombrep2) { System.out.println("El numero escollit per l'ordinador és més gran que " + nombrep + ", " + nombrep1 + " i més petit que " + nombrep2); }
			
			if (x>nombrep && x<nombrep1 && x<nombrep2) { System.out.println("El numero escollit per l'ordinador és més gran que " + nombrep + " i més petit que " + nombrep1 + ", " + nombrep2); }
			
			if (x<nombrep && x>nombrep1 && x>nombrep2) { System.out.println("El numero escollit per l'ordinador és més gran que " + nombrep1 + ", " + nombrep2 + " i més petit que " + nombrep); }
			
			if (x<nombrep && x<nombrep1 && x>nombrep2) { System.out.println("El numero escollit per l'ordinador és més gran que " + nombrep2 + " i més petit que " + nombrep + " i " + nombrep1); }
			
			if (x<nombrep && x<nombrep1 && x<nombrep2) { System.out.println("El numero escollit per l'ordinador és més petit que " + nombrep + ", " + nombrep1 + " i " + nombrep2); }
			
			if (x<nombrep && x>nombrep1 && x<nombrep2) { System.out.println("El numero escollit per l'ordinador és més gran que " + nombrep1 + " i més petit que " + nombrep + " i " + nombrep2); }
			
			if (x>nombrep && x<nombrep1 && x>nombrep2) { System.out.println("El numero escollit per l'ordinador és més gran que " + nombrep + ", " + nombrep2 + " i més petit que " + nombrep1); }
			
			
		}
		
		System.out.println("El valor era: " + x);
		
		
	}

}