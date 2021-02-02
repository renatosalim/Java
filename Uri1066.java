import java.util.Scanner;

public class Uri1066{

        public static void main (String args []){

            Scanner teclado = new Scanner(System.in); 

            int valor;
            int qtidadepar = 0;
            int qtidadeimpar = 0;
            int qtidadepos = 0;
            int qtidadeneg = 0;

            for (int cont = 1; cont <= 5; cont++){
                valor = teclado.nextInt();
                
                if (valor % 2 == 0){
                    qtidadepar++;                  
                } 
                else {
                    qtidadeimpar++;
                }
                if (valor > 0){
                    qtidadepos++;                  
                } 
                else if (valor < 0){
                    qtidadeneg++;                  
                } 
                }

                 System.out.println(qtidadepar+ " valor(es) par(es)");
                 System.out.println(qtidadeimpar+ " valo(res) impar(es)");
                 System.out.println(qtidadepos+ " valor(es) positivo(s)");
                 System.out.println(qtidadeneg+ " valor(es) negativo(s)");

            }           

}