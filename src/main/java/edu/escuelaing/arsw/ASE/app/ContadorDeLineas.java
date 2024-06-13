package edu.escuelaing.arsw.ASE.app;


import java.io.IOException;
import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ContadorDeLineas {
    /**
    * Función que examina un archivo, aplicando un filtro específico, y calcula la cantidad de líneas.
    * @param rutaArchivo La ubicación del archivo que se va a analizar.
    * @param tipoArchivo El criterio de filtrado que se aplicará, puede ser "phy" o "loc".
    * @return El total de líneas contabilizadas después de aplicar el filtro.
    */

    public static int contarLineas(String rutaArchivo, String tipoArchivo){
        Path archivo = Paths.get(rutaArchivo);
        int numeroDeLineas = 0;

        Charset codificacion = Charset.forName("UTF-8");
        try (BufferedReader lector = Files.newBufferedReader(archivo, codificacion)) {
            String linea = null;
            while ((linea = lector.readLine()) != null) {
                if (tipoArchivo.equals("phy")) {
                    numeroDeLineas += 1;
                }
                if (tipoArchivo.equals("loc") && (!validarLinea(linea))){
                   numeroDeLineas += 1;
                }
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        return numeroDeLineas;
    }

    /**
    * Función que verifica si un renglón de texto está en blanco o contiene comentarios.
    * @param linea El texto que se analizará.
    * @return Verdadero si el renglón está vacío o es un comentario, Falso en caso contrario.
    */
    public static boolean validarLinea(String linea){
        if (linea.isEmpty()){
            return true;
        }
        if (linea.contains("//") || linea.contains("/**") || linea.contains("*/") || linea.contains("*") ){
            return true;
        }
        return false;
    }
}