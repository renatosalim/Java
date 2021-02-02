import java.util.Scanner;

public class Uri1074{

        public static void main (String args []){

            Scanner teclado = new Scanner(System.in); 

            int x, val;

            x = teclado.nextInt();

            for (int cont = 1; cont <= x; cont++){
                val = teclado.nextInt();               
                
                if (val % 2 == 0 && val > 0){
                    System.out.println("EVEN POSITIVE");
                }   
                else if (val % 2 != 0 && val > 0){
                    System.out.println("ODD POSITIVE");
                }               
                else if (val % 2 == 0 && val < 0){
                    System.out.println("EVEN NEGATIVE");
                }   
                else if (val % 2 != 0 && val < 0){
                    System.out.println("ODD NEGATIVE");
                }   
                else if (val == 0){
                    System.out.println("NULL");
                }       
            }
        }
}