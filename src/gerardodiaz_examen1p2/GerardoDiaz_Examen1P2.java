/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardodiaz_examen1p2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author gerar
 */
public class GerardoDiaz_Examen1P2 {
     static Scanner lea = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opci=0;
        while(opci!=3){
            System.out.println("-------------------------------");
            System.out.println("1) Agregar PC");
            System.out.println("2) Ingresar PC");
            System.out.println("3) Salir");
            System.out.print("Ingrese una opcion: ");
            opci = lea.nextInt();
            System.out.println("-------------------------------");
            switch(opci){
                case 1:{
                    String cadena = "192.55.63.128";
                    String tokens[]= cadena.split("\\.");
                    System.out.println(tokens[0] + "  " + tokens[2]);
                    
                    
                }
            }
        }
    }
    
}

