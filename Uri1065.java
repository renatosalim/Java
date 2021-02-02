import java.util.Scanner;

public class Uri1065{

        public static void main (String args []){

            Scanner teclado = new Scanner(System.in); 

            int valor;
            int qtidade = 0;
            int total = 0;

            for (int cont = 1; cont <= 5; cont++){
                valor = teclado.nextInt();
                
                if (valor > 0){
                    qtidade++;
                }                
            } 
            
            System.out.println(qtidade+ " valores pares");
        }

}