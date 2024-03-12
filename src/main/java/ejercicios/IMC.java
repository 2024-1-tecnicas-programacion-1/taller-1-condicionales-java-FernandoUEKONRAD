
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class IMC {
    public static String evaluar(int p, double e, int ed) {
     String res="";
        double imc = p / (e * e);
        if (ed<45 && imc < 22.0) {
            res = "bajo";
        } 
        else if (imc >= 22.0 && ed < 45) {
            res = "medio";
        } 
        else if (imc < 22.0 && ed >= 45) {
            res = "medio";
        } 
        else if (imc >= 22.0 && ed >= 45) {
            res = "alto";
        }
        return res;
    }

    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
            System.out.print("Peso:");
        int peso = lector.nextInt();
        System.out.print("Estatura:");
        double estatura = lector.nextDouble();
        System.out.print("Edad:");
        int edad = lector.nextInt();
        
        String respuesta = evaluar(peso, estatura, edad);
        System.out.println(respuesta);
    }
}
