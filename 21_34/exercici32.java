import java.util.Scanner;

public class exercici32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	final double minPreu = 500;
	final double descompte = 0.8;
	final double descompte2 = 0.2;
	final double maxDescompte = 200;
	double actualPreu = 0;
	double preuFinal = 0;
	
	Scanner entrada;
	entrada=new Scanner(System.in);
	
	System.out.println("Introdueix el valor inicial del preu per calcular-ne el descompte");
	actualPreu = entrada.nextDouble();
	
		
	if (actualPreu > 0 ) {
		
		if (actualPreu >= minPreu) {
		
			if (actualPreu*descompte2 <= maxDescompte)  { 
			
				System.out.println("El preu final de la teva compra, amb el descompte adient és:" + actualPreu*descompte); }
			
			else { System.out.println("El preu final de la teva compra és:" + (actualPreu - maxDescompte)); }
	
		}		 
		
		else { System.out.println("No se li pot aplicar cap mena de descompte, aixi doncs el preu final queda igual:" + actualPreu); }
		
		}
	
	else { System.out.println("Error! S'ha introduit un preu negatiu."); }
	}
}
