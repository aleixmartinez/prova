import  java.util.Scanner;

public class fwfwef {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  int MIN = 0;
  int A = 0;
  int B = 0;
  int C = 0;
  
  Scanner entrada;
  entrada = new Scanner (System.in);
  
  System.out.println("Introdueix els valors de A, B i C: ");
  A = entrada.nextInt();
  B = entrada.nextInt();
  C = entrada.nextInt();
  
  if ( A > B && B < C) { MIN = B; } 
  if ( B > A && A < C) { MIN = A; }
  if ( A > C && C < B) { MIN = C; }
  
  System.out.println("El valor més petit dels 3 que has introduït és: " + MIN);
  
  entrada.close();
  
 }

}