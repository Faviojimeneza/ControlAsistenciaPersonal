
package controlasistencias;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class archivo {

    FileWriter fwTxt;
    PrintWriter pwTxt;
  

    public void archivo() {
        try {
            fwTxt = new FileWriter("C:\\Users\\Usuario\\Downloads\\ControlAsistencias\\ControlAsistencias\\RegistroPersonas.txt", true);
            pwTxt = new PrintWriter(fwTxt);
            personas p = new personas();

            // ControlAsistencias hora = new ControlAsistencias();
            pwTxt.println(p.cedula + ";" + p.nombre + ";" + p.apellido + ";" + p.edad + ";" + p.date);
        } catch (Exception e) {
            System.err.println("Se presento un error al abrir el archivo" + e);
        } finally {
            System.out.println("Archivo txt creado");

            if (null != fwTxt) {
                try {
                    fwTxt.close();

                } catch (Exception e) {
                }
            }

        }
    }
 // calcular promedio
    public double entregarPromedio() {
        int j = 0;
        double promedio = 0;
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\Usuario\\Downloads\\ControlAsistencias\\ControlAsistencias\\RegistroPersonas.txt"))) {

// read line by line
            String line;
            String edad = "";
            int i, puntoycomas;
//leer cada linea
            while ((line = br.readLine()) != null) {
                i = 0;
                puntoycomas = 0;
//leer letra por letra
                while (puntoycomas < 3) {
                    if (line.charAt(i) == ';') {
                        puntoycomas++;
                    }
                    i++;
                }
//saltar un caracter para pasarse el ;

                while (line.charAt(i) != ';') {
                    edad += line.charAt(i);
                    i++;
                }
                  
                promedio += Double.parseDouble(edad);
                      
                edad = "";
//incrementar la fila de los arreglos o de la tabla
                j++;
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
            System.out.println("Error en la lectura del archivo");
        }
        System.out.println("El promedio de edad es: " + promedio/j);
        return promedio / j;
    }

}






























