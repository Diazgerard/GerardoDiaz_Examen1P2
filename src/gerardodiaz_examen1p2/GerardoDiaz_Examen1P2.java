/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardodiaz_examen1p2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author gerar
 */
public class GerardoDiaz_Examen1P2 {
     static Scanner lea = new Scanner (System.in);
     static ArrayList<Object> PC = new ArrayList();
     static ArrayList<Object> LAP = new ArrayList();
     static ArrayList<String> ips = new ArrayList();
     static ArrayList<String> mascara = new ArrayList();
     
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PC_Escritorio escri = new PC_Escritorio();
        Laptop laptop = new Laptop();
       
        
        
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
                    
                    int opc = 0;
                    while (opc != 3) {
                        System.out.println("-------------------------------");
                        System.out.println("1) CRUD PC Escritorio");
                        System.out.println("2) CRUD Laptop");
                        System.out.println("3) Salir");
                        System.out.print("Ingrese una opcion: ");
                        opc = lea.nextInt();
                        System.out.println("-------------------------------");
                        switch (opc) {
                            case 1: {
                                int op= 0;
                                while (op != 4) {
                                    System.out.println("-------------------------------");
                                    System.out.println("1) Crear");
                                    System.out.println("2) Eliminar");
                                    System.out.println("3) Listar");
                                    System.out.println("4) Salir");
                                    System.out.print("Ingrese una opcion: ");
                                    op = lea.nextInt();
                                    System.out.println("-------------------------------");
                                    switch (op) {
                                        case 1: {
                                            System.out.print("Ingrese IP: ");
                                            String ip = lea.next();
                                            String tokens[] = ip.split("\\.");
                                            ips.add(tokens[0]);
                                            ips.add(tokens[1]);
                                            ips.add(tokens[2]);
                                            ips.add(tokens[3]);
                                            escri.setIP(ip);
                                            
                                            System.out.print("Ingrese la mascara de red: ");
                                            String red = lea.next();
                                            String tokens1[] = red.split("\\.");
                                            ips.add(tokens1[0]);
                                            ips.add(tokens1[1]);
                                            ips.add(tokens1[2]);
                                            ips.add(tokens1[3]);
                                            escri.setMascara(red);
                                            
                                            System.out.print("Ingrese hostname: ");
                                            String name = lea.next();
                                            escri.setHostname(name);
                                            
                                            System.out.print("Ingrese la cantidad de Ram {int} : ");
                                            int ram = lea.nextInt();
                                            escri.setRam(ram);
                                            
                                            System.out.print("Ingrese Capacidad de Almanecamiento {str} : ");
                                            int capacidad = lea.nextInt();
                                            escri.setCapacidad(capacidad);
                                            
                                            String almacenamiento = "";
                                            escri.setAlmacimiento(almacenamiento);
                                            
                                            int opcion = 0;
                                            while (opcion != 3) {
                                                System.out.println("-------------------------------");
                                                System.out.println("Ingrese Tipo de Almacenamiento");
                                                System.out.println("1) HDD");
                                                System.out.println("2) SSD");
                                                System.out.println("3) Salir");
                                                System.out.print("Ingrese una opcion: ");
                                                opcion= lea.nextInt();
                                                System.out.println("-------------------------------");
                                                switch (opcion) {
                                                    case 1: {
                                                        almacenamiento += "HDD";
                                                    }
                                                    break;
                                                    case 2:{
                                                        almacenamiento += "SSD";
                                                    }
                                                    break;
                                                }
                                            }
                                            
                                            String grafica = "";
                                            escri.setGrafica(grafica);
                                            
                                            int opcio = 0;
                                            while (opcio != 3) {
                                                System.out.println("-------------------------------");
                                                System.out.println("Ingrese Si tiene tarjeta grafica: ");
                                                System.out.println("1) SI");
                                                System.out.println("2) NO");
                                                System.out.println("3) Salir");
                                                System.out.print("Ingrese una opcion: ");
                                                opcio = lea.nextInt();
                                                System.out.println("-------------------------------");
                                                switch (opcio) {
                                                    case 1: {
                                                        grafica += "SI";
                                                    }
                                                    break;
                                                    case 2:{
                                                        grafica += "NO";
                                                    }
                                                    break;
                                                }
                                            }
                                            
                                            PC_Escritorio PCE = new PC_Escritorio(ram, capacidad, almacenamiento, grafica, ip, red, name);
                                            PC.add(PCE);
                                        }
                                        break;
                                        case 2:{
                                            
                                        }
                                        break;
                                    }
                                }
                                
                                
                            }
                            break;
                            case 2:{
                                int op= 0;
                                while (op != 4) {
                                    System.out.println("-------------------------------");
                                    System.out.println("1) Crear");
                                    System.out.println("2) Eliminar");
                                    System.out.println("3) Listar");
                                    System.out.println("4) Salir");
                                    System.out.print("Ingrese una opcion: ");
                                    op = lea.nextInt();
                                    System.out.println("-------------------------------");
                                    switch (op) {
                                        case 1: {
                                            System.out.print("Ingrese IP: ");
                                            String ip = lea.next();
                                            String tokens[] = ip.split("\\.");
                                            mascara.add(tokens[0]);
                                            mascara.add(tokens[1]);
                                            mascara.add(tokens[2]);
                                            mascara.add(tokens[3]);
                                            laptop.setIP(ip);
                                            
                                            System.out.print("Ingrese la mascara de red: ");
                                            String red = lea.next();
                                            String tokens1[] = red.split("\\.");
                                            mascara.add(tokens1[0]);
                                            mascara.add(tokens1[1]);
                                            mascara.add(tokens1[2]);
                                            mascara.add(tokens1[3]);
                                            laptop.setMascara(red);
                                            
                                            System.out.print("Ingrese hostname: ");
                                            String name = lea.next();
                                            laptop.setHostname(name);
                                            
                                            System.out.print("Ingrese Marca: ");
                                            String marca = lea.next();
                                            laptop.setMarca(marca);
                                            
                                            System.out.print("Ingrese Definicion de Pantalla: ");
                                            String pantalla = lea.next();
                                            laptop.setPantalla(pantalla);
                                            
                                            String  RGB = "";
                                            laptop.setRGB(RGB);
                                            
                                            int opcio = 0;
                                            while (opcio != 3) {
                                                System.out.println("-------------------------------");
                                                System.out.println("Ingrese Si tiene RGB: ");
                                                System.out.println("1) SI");
                                                System.out.println("2) NO");
                                                System.out.println("3) Salir");
                                                System.out.print("Ingrese una opcion: ");
                                                opcio = lea.nextInt();
                                                System.out.println("-------------------------------");
                                                switch (opcio) {
                                                    case 1: {
                                                        RGB += "SI";
                                                    }
                                                    break;
                                                    case 2:{
                                                        RGB += "NO";
                                                    }
                                                    break;
                                                }
                                            }
                                            Laptop lap = new Laptop(marca, pantalla, RGB, ip, red, name);
                                            LAP.add(lap);
                                        }
                                        break;
                                        case 2:{
                                            
                                        }
                                        break;
                                        case 3 :{
                                            
                                        }
                                        break;
                                            
                                    }
                                }
                            }
                            
                        }
                    }
                    
                }// ingresar PC
                break;
                case 2:{
                    
                }
                break;
                    
            }
        }
    }
    
     public String  dec2bin(int [] numeros){
        for (int i = 0; i < numeros.length; i++) {
            int and = numeros[i]&numeros[i+1];
        int or = numeros[i]|numeros[i+1];
        System.out.println("And Operator: " + and);
        System.out.println("OR Operator: " + or);
        String binario = "";
        if (and > 0) {
            while (and > 0) {
                if (and % 2 == 0) {
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                and = (int) and / 2;
            }
        } else if (and == 0) {
            binario = "0";
        } else {
           
        }
        //System.out.println("El número convertido a binario de AND es: " +  binario);
        String cadenabinario = "0";
        String completo = binario  + "";
        String ahora = "";
        while(completo.length() < 8){
            completo += cadenabinario;
            ahora += cadenabinario;
            
        }
        
        //System.out.println(completo);
        System.out.println("El número convertido a binario de AND es: " + ahora + binario);
        System.out.println("-------------------------------------------------------");
        String binario1 = "";
        if (or > 0) {
            while (or > 0) {
                if (or % 2 == 0) {
                    binario1 = "0" + binario1;
                } else {
                    binario1 = "1" + binario1;
                }
                or = (int) or / 2;
            }
        } else if (or == 0) {
            binario1 = "0";
        } else {
            
        }
        //System.out.println("El número convertido a binario de OR es: " +  binario1);
        String cadenabinario1 = "0";
        String completo1 = binario1 + "" ;
        String ahora1 = "";
        while(completo1.length() < 8){
            completo1 += cadenabinario1;
            ahora1 += cadenabinario;
            
        }
        
        //System.out.println(completo1);
        System.out.println("El número convertido a binario de OR es: " + ahora1 + binario1);
        return binario;
       }
        return "Trabajo realizado";
        
    
    }
    
}

