import java.util.Scanner;
public class exercucu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int billets100, billets50, billets20, billets10, billets5, valor, residuu;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Quants euros vols descompondre?");
		valor = entrada.nextInt();
		
		billets100 = valor/100;
		residuu = valor%100;
		billets50 = residuu/50;
		residuu = residuu%50;
		billets20 = residuu/20;
		residuu = residuu%20;
		billets10 = residuu/10;
		residuu = residuu%10;
		billets5 = residuu/5;
		residuu = residuu%5;
		
		System.out.println("billets de 100 " + billets100);
		System.out.println("billets de 50 " + billets50);
		System.out.println("billets de 20 " + billets20);
		System.out.println("billets de 10 " + billets10);
		System.out.println("billets de 5 " + billets5);
		
	}

}
