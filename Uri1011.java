import java.util.Scanner;
    public class Uri1011{
        public static void main(String args[]){
            Scanner teclado = new Scanner (System.in);

            int Raio;
            Double Area;

            Raio = teclado.nextInt();

            Area = (Raio*Raio*Raio) * 3.14159 * (4.0/3) ;

            System.out.printf("VOLUME = %.3f\n", Area);
                
        }
    }