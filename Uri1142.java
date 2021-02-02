import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();
        int pum=1;

        for (int cont = 1; cont <= N; cont++){
            System.out.println(pum + " " + (pum+1) + " " + (pum+2) + " PUM");
            pum += 4;
        }
    }
}