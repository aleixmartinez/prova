import java.util.Scanner;

public class exercici33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int numeroHores= 0;
	double salariHora = 0;
	double salariFinal = 0;
	int diferencia2 = 0;
	int diferencia3 = 0;
	
	Scanner entrada;
	entrada=new Scanner(System.in);
	
	System.out.println("Quantes hores ha treballat el teu treballador a la setmana:");
	numeroHores = entrada.nextInt();
	System.out.println("A quant es paga l'hora a la teva empresa? En Euros:");
	salariHora = entrada.nextInt();
	
		
	if (numeroHores <= 40) {
		
		salariFinal= salariHora*numeroHores;
		
		System.out.println(" El salari Final es de " + salariFinal + "euros" );
	
	}
	
	if (numeroHores >= 40 && numeroHores <= 48 ) {
		
		diferencia2 = numeroHores - 40;
		salariFinal = ((salariHora*40)+(diferencia2*salariHora*2));
		System.out.println(" El salari Final es de " + salariFinal + "euros" ); }
		
	if (numeroHores > 48) {
		
		diferencia3= numeroHores - 48;
		diferencia2= numeroHores - diferencia3 - 40;
		salariFinal = ((salariHora*40)+(diferencia2*salariHora*2)+(diferencia3*salariHora*3));
		System.out.println(" El salari Final es de " + salariFinal + "euros" ); }
	
				}
	

}
