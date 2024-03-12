
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Division {
    public static String evaluar(int d, int divi) {
        // TODO: Coloca aquí el código del ejercicio 3: Division
        String res= "";
        int c =d/divi ;
        int r = d%divi;    
        if (r == 0){res = "La división es exacta. \n"
                + "Cociente: " + c + "\n"
                + "Residuo: " + r;}
        else if (r != 0){res = "La división no exacta. \n"
                + "Cociente: " + c + "\n"
                + "Residuo: " + r;}
        return res;
    }

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Dividendo:");
        int dividendo = lector.nextInt();
        System.out.print("Divisor:");
        int divisor = lector.nextInt();

        String respuesta = evaluar(dividendo, divisor);
        System.out.println(respuesta);
    }
}
