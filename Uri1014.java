import java.util.Scanner;

public class Uri1014{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int distPercorrida; 
        Double combustGasto, consumoMedio;

        distPercorrida = teclado.nextInt ();
        combustGasto = teclado.nextDouble ();
                
        consumoMedio = (distPercorrida/combustGasto);

        System.out.printf ("%.3f km/l\n", consumoMedio);
    }  

}