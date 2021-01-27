import java.util.Scanner;

public class Uri1041{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        float val1, val2;
                        
        val1 = teclado.nextFloat ();
        val2 = teclado.nextFloat ();
                        
        if (val1 > 0 && val2 > 0) {
            System.out.println ("Q1");
        }
        else if (val1 < 0 && val2 > 0) {
            System.out.println ("Q2");
        }    
        else if (val1 < 0 && val2 < 0) {
            System.out.println ("Q3");
        }   
        else if (val1 > 0 && val2 < 0) {
            System.out.println ("Q4");
        }       
        else if (val1 == 0 || val2 == 0) {
            System.out.println ("Origem");
        }               
        
    }
}