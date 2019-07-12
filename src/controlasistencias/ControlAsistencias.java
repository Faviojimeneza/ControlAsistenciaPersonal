package controlasistencias;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ControlAsistencias {

    public static void main(String[] args) {

        System.out.println("*#*#*#*BIENVENIDO AL CONTROL DE ASISTENCIA*#*#*#*");

        archivo archivitos = new archivo();
        Scanner entrada = new Scanner(System.in);
        archivitos.archivo();
        archivitos.entregarPromedio();

    }

}
        
      
            
    
   









































