
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        int edad;
        Calendar calendario = Calendar.getInstance();
        Date fecha = new Date();
        int year = calendario.get (Calendar.YEAR);
        int day = fecha.getDate();
        int month = fecha.getMonth();
        if(mes<month){
             edad = (year-anno);
            System.out.println("Usted tiene" +edad+ "años");
        }
        else if (mes>month){
             edad = (year-anno)-1;
             System.out.println("Usted tiene " +edad+ " años");
        }
        else if (mes==month && dia>=day){
             edad = year-anno;
             System.out.println("Usted tiene " +edad+ " años");
        }
        else if (mes==month && dia<day){
            edad = (year-anno)-1;
            System.out.println("Usted tiene " +edad+ " años");
        }
        return "";
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
