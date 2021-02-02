import java.util.Scanner;

public class Uri1002{
    
    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        double Raio, Area;
        
        Raio = teclado.nextDouble();

        Area = (Raio * Raio) * 3.14159;

        System.out.printf("A=%.4f\n",Area);
      
        
    }
}