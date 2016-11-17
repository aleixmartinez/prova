import java.util.Scanner;

public class exercici34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double anys= 0;
	double benefici = 0;
	double salari = 900;
	double benefici2 = 0;
	
	Scanner entrada;
	entrada=new Scanner(System.in);
	
	System.out.println("Quantes anys porta el treballador a l'empresa?");
	anys = entrada.nextDouble();
	
		
	if (anys <= 1) {
	
		benefici = salari*5/100;
		System.out.println("El benefici sera de:" + benefici ); } 
		
	
	if (anys > 1 && anys <= 2 ) {
		
		benefici = salari*7/100;
		System.out.println("El benefici sera de:" + benefici ); }
		
	if (anys > 2 && anys <= 5 ) {
			
		benefici = salari*10/100;
		System.out.println("El benefici sera de:" + benefici ); }
			
	if (anys > 5 && anys <= 10 ) {
			
		benefici = salari*15/100;
		System.out.println("El benefici sera de:" + benefici ); }
					
	if (anys > 10) {
				
		benefici = salari*20/100;
		System.out.println("El benefici sera de:" + benefici ); }
	}
}
						
		
