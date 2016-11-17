import java.util.Scanner;

public class practicaex13 {

	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	int billets5, billets10, billets20, billets50, billets100, valor;
	
	
	Scanner entrada;
	entrada = new Scanner(System.in);
	
	System.out.println("Introduiu el valor en euros");
	valor = entrada.nextInt();
	System.out.println("Aquest doncs es els billets de 5, 10, 20, 50, 100 que podries tenir en cada un");
	
	billets5 = valor/5;
	billets10 = valor/10;
	billets20 = valor/20;
	billets50 = valor/50;
	billets100 = valor/100;
	
	System.out.println("Billets de 5 " + billets5);
	System.out.println("Billets de 10 " + billets10);
	System.out.println("Billets de 20 " + billets20);
	System.out.println("Billets de 50 " + billets50);
	System.out.println("Billets de 100 " + billets100);
	}
}
