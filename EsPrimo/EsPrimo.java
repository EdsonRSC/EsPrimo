import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int num = en.nextInt();
        //Verifica si el numero es primo
        boolean esPrimo=true;
        if (num<=1) {
            esPrimo = false;
        }else{
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0){
                esPrimo=false;
                break;
            }
        }
    }
    //Mostrar el resultado
    if (esPrimo) {
        System.out.println(num+"-Es primo");
    }else{
        System.out.println(num+"-No es primo");
    }
    en.close();
    }
}
