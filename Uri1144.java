import java.util.Scanner;

public class Uri1144{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();

        for (int c = 1; c <= N; c++){
            System.out.println(c + " " + (c*c) + " " + (c*c*c));
            System.out.println(c + " " + (c*c+1) + " " + (c*c*c+1));
        }
    }
}