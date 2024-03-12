
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {
    public static String evaluar(int n1, int n2, int n3, int n4) {
        if (n1>n2 && n3>n4)
            System.out.println(n2 +" "+n4+" "+n3+" "+n1);
        else if (n1<n2 && n3<n4){
            System.out.println(n1 +" "+n2+" "+n3+" "+n4);
        } 
        else if (n1>n4 && n3<n2){
            System.out.println(n3 +" "+n2+" "+n4+" "+n1);
        }
        else if (n1>n2 && n3<n4){
            System.out.println(n2 +" "+n3+" "+n4+" "+n1);
        }
        return "";
    
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int n1 = lector.nextInt();
        System.out.print("Número 2:");
        int n2 = lector.nextInt();
        System.out.print("Número 3:");
        int n3 = lector.nextInt();
        System.out.print("Número 4:");
        int n4 = lector.nextInt();
        
        String respuesta = evaluar(n1, n2, n3, n4);
        System.out.println(respuesta);
    }
}
