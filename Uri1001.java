import java.util.Scanner;

public class Uri1001{
    public static void main (String args[]){

        Scanner teclado = new Scanner (System.in);

        int X;
        int A = teclado.nextInt();
        int B = teclado.nextInt();

        X = A + B;

        System.out.println("X = " +X);
    }
}