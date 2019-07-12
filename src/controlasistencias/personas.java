package controlasistencias;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class personas {

    String cedula;
    String nombre;
    String apellido;
    int edad;
    Object date;

    //Crear el archivo txt
    //Pedir los datos de entrada de las personas
    public personas() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero de cedula");
        cedula = entrada.next();

        System.out.println("Ingrese el nombre");
        nombre = entrada.next();

        System.out.println("Ingrese el apellido");
        apellido = entrada.next();

        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();

        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss" + ";" + "dd/MM/yyyy");

        System.out.println("Hora y fecha de entrada: " + hourdateFormat.format(date));
        this.date = hourdateFormat.format(date);

    }
}





































