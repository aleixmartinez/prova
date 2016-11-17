import java.util.Scanner;
public class practicaex2 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int numero1, numero2, resultat;
	
	Scanner entrada;
	entrada= new Scanner(System.in);
	
	System.out.println("Introduir el primer numero");
	numero1 = entrada.nextInt();
	System.out.println("Intrduir el segon numero");
	numero2 = entrada.nextInt();
	
	System.out.println("Resultat");
	resultat = numero2+numero1;
	System.out.println(resultat);
	
	
	}
}
