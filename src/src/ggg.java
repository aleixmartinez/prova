import java.util.Scanner;
public class ggg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		int billets5, billets10, billets20, billets50, billets100, valor, restant;
		
		System.out.println("Introduiu el valor en euros");
		valor = entrada.nextInt();
		
		billets100 = valor/100;
		restant = valor%100;
		billets50 = restant/50;
		restant = restant%50;
		billets20 = restant/20;
		restant = restant%20;
		billets10 = restant/10;
		restant = restant%10;
		billets5 = restant/5;
		System.out.println("Billets de 5 " + billets5);
		System.out.println("Billets de 10 " + billets10);
		System.out.println("Billets de 20 " + billets20);
		System.out.println("Billets de 50 " + billets50);
		System.out.println("Billets de 100 " + billets100);
	}

}
