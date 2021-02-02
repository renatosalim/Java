import java.util.Scanner;

public class Uri1074n{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, X;

        N = teclado.nextInt();

        for (int count = 1; count <= N; count++){
            X = teclado.nextInt();

            if (X == 0){
                System.out.println("NULL");
            }
            else if (X % 2 == 0){
                System.out.print("EVEN ");
                if (X > 0){
                    System.out.println("POSITIVE");
                }
                else{
                    System.out.println("NEGATIVE");
                }
            }
            else {
                System.out.print("ODD ");
                if (X > 0){
                    System.out.println("POSITIVE");
                }
                else{
                    System.out.println("NEGATIVE");
                }
            }
        }
    }
}
© 2021 GitHub, Inc.