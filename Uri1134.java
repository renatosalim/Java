import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tipo;
        int qtdAlcool   = 0;
        int qtdGasolina = 0;
        int qtdDiesel   = 0;

        do{
            tipo = teclado.nextInt();
            switch(tipo){                   //   if (tipo == 1){
                case 1:                     //      qtdAlcool++l;
                    qtdAlcool++;            //   }
                    break;                  //   else if (tipo == 2){
                case 2:                     //      qtdGasolina++;
                    qtdGasolina++;          //   }
                    break;                  //   else if (tipo == 3){}
                case 3:                     //      qtdDiesel++;
                    qtdDiesel++;            //   }
                    break;                  //
            }


        } while (tipo != 4);
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+qtdAlcool);
        System.out.println("Gasolina: "+qtdGasolina);
        System.out.println("Diesel: "+qtdDiesel);
    }
}