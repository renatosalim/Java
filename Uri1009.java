import java.util.Scanner;

    public class Uri1009{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);

            String Nome;
            double Salario, Vendas, Receber;

                Nome = teclado.nextLine();
                Salario = teclado.nextDouble();
                Vendas = teclado.nextDouble();
            
                    Receber = Salario + (Vendas*0.15);

                System.out.printf("TOTAL = R$ %.2f\n", Receber); 

        }
    }