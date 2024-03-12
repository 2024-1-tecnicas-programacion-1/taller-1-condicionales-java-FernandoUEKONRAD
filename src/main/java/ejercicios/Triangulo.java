package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;


public class Triangulo {
    public static String evaluar(double a, double b, double c) {
        if (a>(b+c) || b>(a+c) || c>(b+a)){
            System.out.println("No es un triángulo válido");
        }
        else if (a==b && b==c){
            System.out.println("El triángulo es equilátero");
        }
        else if ((a==b && (b!=c || a!=c)) || (b==c && (c!=a || b!=a)) || (a==c && (c!=b || a!=b))){
            System.out.println("El triángulo es isósceles");
        }
        else if (a!=b && b!=c && a!=c){
            System.out.println("El triángulo es escaleno");
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("a:");
        double a = lector.nextDouble();
        System.out.print("b:");
        double b = lector.nextDouble();
        System.out.print("c:");
        double c = lector.nextDouble();
        
        String respuesta = evaluar(a, b, c);
        System.out.println(respuesta);
    }
}
