import java.util.Scanner;
    public class Uri1013{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);

            int A, B, C;

            A = teclado.nextInt();
            B = teclado.nextInt();
            C = teclado.nextInt();

            MaiorAB = (A+B+abs(A-B))/2;

            System.out.println(MaiorAB+ "eh o maior");

        }

    }