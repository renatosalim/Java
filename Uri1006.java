import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        double A, B, C, Media;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        Media = (A*0.2)+(B*0.3)+(C*0.5);

        System.out.printf("MEDIA = %.1f\n", Media);

    }
}