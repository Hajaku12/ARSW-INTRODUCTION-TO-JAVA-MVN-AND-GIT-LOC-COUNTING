package edu.escuelaing.arsw.ASE.app;

public class PruebaContadorDeLineas {
    public static void main(String[] args){
        System.out.println("El archivo contiene: " + ContadorDeLineas.contarLineas(args[1], args[0]) + " líneas");
    }
}