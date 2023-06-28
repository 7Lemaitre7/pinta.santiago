package Horarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HorarioFormato {
    public void spImpresion() {
        File micarpeta= new File("src\\Datos");
        
        File[] listaFicheros=micarpeta.listFiles();
        for (File file : listaFicheros) {
            System.out.println(file.toString());
            Horario.leerArchivoCSV(file.toString());
        }

    }
}
