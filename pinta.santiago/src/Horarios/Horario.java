package Horarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Horario {
    String spCarpeta = "src/Datos";
    File spDirectorio = new File(spCarpeta);
    File[] spArchivos = spDirectorio.listFiles();

    public static void leerArchivoCSV(String archivo) {
        String linea = "";
        String separador = ";";
        System.out.println();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(separador);

                for (String dato : datos) {
                    System.out.print(dato + " ");
                }
                
                System.out.println();
            }System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void spShowHorario() {
        if (spArchivos != null) {
            for (File archivo : spArchivos) {
                if (archivo.isFile()) {
                    String archivoNombre = archivo.getName();
                    String archivoSinExtension = archivoNombre.substring(0,archivoNombre.lastIndexOf('.'));
                    System.out.println("\t - " + archivoSinExtension);
                }
            }
        }
    }
}
