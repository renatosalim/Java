import java.util.Scanner;

public class Uri1020{

    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        int idade, resto, ano, mes, dia; 
                
        idade = teclado.nextInt ();
                        
        ano = idade / 365;
        resto = idade % 365;
        mes = resto / 30;
        dia = resto % 30;


        System.out.println (ano + " ano(s) ");
        System.out.println (mes + " mes(es) ");        
        System.out.println (dia + " dia(s) ");

    }  

}