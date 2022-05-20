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
    static Scanner lea = new Scanner(System.in);
    static ArrayList todo = new ArrayList();
    static ArrayList<Object> PC = new ArrayList();
    static ArrayList<Object> LAP = new ArrayList();

    static ArrayList<Integer> numbers = new ArrayList();
    static ArrayList<Integer> numbers2 = new ArrayList();
    
    static ArrayList<String>  binarioImp = new ArrayList();
    static ArrayList<String>  binarioImp2 = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PC_Escritorio escri = new PC_Escritorio();
        Laptop laptop = new Laptop();
       
        ArrayList<String> ips = new ArrayList();
        ArrayList<String> mascara = new ArrayList();
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
                                            mascara.add(tokens1[0]);
                                            mascara.add(tokens1[1]);
                                            mascara.add(tokens1[2]);
                                            mascara.add(tokens1[3]);
                                            escri.setMascara(red);
                                            
                                            System.out.print("Ingrese hostname: ");
                                            String name = lea.next();
                                            escri.setHostname(name);
                                            
                                            System.out.print("Ingrese la cantidad de Ram {int} : ");
                                            int ram = lea.nextInt();
                                            escri.setRam(ram);
                                            
                                            System.out.print("Ingrese Capacidad de Almanecamiento {int} : ");
                                            int capacidad = lea.nextInt();
                                            escri.setCapacidad(capacidad);
                                            
                                            String almacenamiento = "";
                                            escri.setAlmacimiento(almacenamiento);
                                            
                                            int opcion = 0;
                                            
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
                                            
                                            
                                            String grafica = "";
                                            escri.setGrafica(grafica);
                                            
                                            int opcio = 0;
                                           
                                                System.out.println("-------------------------------");
                                                System.out.println("Ingrese Si tiene tarjeta grafica: ");
                                                System.out.println("1) SI");
                                                System.out.println("2) NO");
                                                
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
                                            
                                            
                                            PC_Escritorio PCE = new PC_Escritorio(ram, capacidad, almacenamiento, grafica, ip, red, name);
                                            PC.add(PCE);
                                            todo.add(PCE);
                                        }
                                        break;
                                        case 2:{
                                            for (Object object : PC) {
                                                System.out.println(object);
                                                
                                            }
                                            
                                            System.out.print("Ingrese Posicion: ");
                                            int pos = lea.nextInt();
                                            
                                            PC.remove(pos);
                                        }
                                        break;
                                        case 3:{
                                            for (Object object : PC) {
                                                System.out.println(object);
                                                
                                            }
                                        }
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
                                            ips.add(tokens[0]);
                                            ips.add(tokens[1]);
                                            ips.add(tokens[2]);
                                            ips.add(tokens[3]);
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
                                            
                                            Laptop lap = new Laptop(marca, pantalla, RGB, ip, red, name);
                                            LAP.add(lap);
                                            todo.add(lap);
                                        }
                                        break;
                                        case 2:{
                                            
                                            for (Object object : LAP) {
                                                System.out.println(object);
                                                
                                            }
                                            
                                            System.out.print("Ingrese Posicion: ");
                                            int pos = lea.nextInt();
                                            
                                            LAP.remove(pos);
                                            
                                        }
                                        break;
                                        case 3 :{
                                            for (Object object : LAP) {
                                                System.out.println(object);
                                                
                                            }
                                            
                                        }
                                        break;
                                            
                                    }
                                }
                            }
                            
                        }
                    }
                    
                }// ingresar PC
                break;
                case 2: {
                    for (Object object : LAP) {
                        if (object instanceof PC) {
                            System.out.println("" + LAP.indexOf(object) + "- " + object);
                        }

                    }
                    for (Object object : PC) {
                        if (object instanceof PC) {
                            System.out.println("" + PC.indexOf(object) + "- " + object);
                        }

                    }
                    for (int i = 0; i < todo.size(); i++) {
                        int cont = 4;
                        int[] numeros = new int[cont];
                        convertir(ips);
                        numeros = lectura(cont);
                        pin(numeros);
                        System.out.println();
                        //System.out.println("------mascara-------");
                        int[] numeros2 = new int[cont];
                        convertir2(mascara);
                        numeros2 = lectura2(cont);
                        pin2(numeros2);

                        System.out.print(binarioImp);
                        System.out.println();
                        System.out.print(binarioImp2);
                        System.out.println();

                        System.out.println(comparar(binarioImp, binarioImp2));
                        System.out.println();
                    }

                }
                break;
                    
            }
        }
    }
    public static String comparar(ArrayList<String> string, ArrayList<String> string2){
        int contador = 0;
        String ping = "";
        for (int i = 0; i < string2.size(); i++) {
            String ver2 = string2.get(i);
            for (int j = 0; j < ver2.length(); j++) {
                if(ver2.charAt(i)=='1'){
                    contador++;
                }
            }
        }
        
        for (int i = 0; i < contador; i++) {
            String ver = string.get(i);
            String ver2 = string2.get(i);
            if(ver.charAt(i)==ver2.charAt(i)){
                ping += "ping exitoso";
            }else{
                ping += "Computadora inalcanzable";
            }
            
        }
        
        
        return ping;
        
    }
    
    public static int[] convertir(ArrayList<String> numeros){
        int[] temporal = new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            int convertir = Integer.parseInt(numeros.get(i));
            numbers.add(convertir);
        }
         return temporal;
    } 
    public static int[] lectura(int size){
        int[] temporal = new int[size];
        for (int i = 0; i < temporal.length; i++) {
            temporal[i] = numbers.get(i);
            
        }
        return temporal;
    }
    public static int[] convertir2(ArrayList<String> numeros){
        int[] temporal = new int[numeros.size()];
        for (int i = 0; i < numeros.size(); i++) {
            int convertir = Integer.parseInt(numeros.get(i));
            numbers2.add(convertir);
        }
         return temporal;
    } 
    public static int[] lectura2(int size){
        int[] temporal = new int[size];
        for (int i = 0; i < temporal.length; i++) {
            temporal[i] = numbers2.get(i);
            
        }
        return temporal;
    }
    
     public static String  pin(int [] numeros){
         
        String binary = "";
        for (int i = 0; i < numeros.length; i++) {

            String binario = "";
            if (numeros[0] > 0) {
                while (numeros[0] > 0) {
                    if (numeros[0] % 2 == 0) {
                        binario = "0" + binario;
                    } else {
                        binario = "1" + binario;
                    }
                    numeros[0] = (int) numeros[0] / 2;
                }
            } else if (numeros[0] == 0) {
                binario = "0";
            } else {

            }

            String cadenabinario = "0";
            String completo = binario + "";
            String ahora = "";
            while (completo.length() < 8) {
                completo += cadenabinario;
                ahora += cadenabinario;

            }

           // System.out.println("Primero numero " + ahora + binario);
            binary += ahora;
            binary += binario;
            // System.out.println("-------------------------------------------------------");
            
            
            String binario1 = "";
            if (numeros[1] > 0) {
                while (numeros[1] > 0) {
                    if (numeros[1] % 2 == 0) {
                        binario1 = "0" + binario1;
                    } else {
                        binario1 = "1" + binario1;
                    }
                    numeros[1] = (int) numeros[1] / 2;
                }
            } else if (numeros[1] == 0) {
                binario1 = "0";
            } else {

            }

            String cadenabinario1 = "0";
            String completo1 = binario1 + "";
            String ahora1 = "";
            while (completo1.length() < 8) {
                completo1 += cadenabinario1;
                ahora1 += cadenabinario;

            }

            
            //System.out.println("Segundo numero:  " + ahora1 + binario1);
            binary += ahora1;
            binary += binario1;
            
           // System.out.println("-------------------------------------------------------");
            
            
            String binario2 = "";
            if (numeros[2] > 0) {
                while (numeros[2] > 0) {
                    if (numeros[2] % 2 == 0) {
                        binario2 = "0" + binario2;
                    } else {
                        binario2 = "1" + binario2;
                    }
                    numeros[2] = (int) numeros[2] / 2;
                }
            } else if (numeros[2] == 0) {
                binario2 = "0";
            } else {

            }

            String cadenabinario2 = "0";
            String completo2 = binario2 + "";
            String ahora2 = "";
            while (completo2.length() < 8) {
                completo2 += cadenabinario2;
                ahora2 += cadenabinario;

            }

            
            //System.out.println("Tercer numero:  " + ahora2 + binario2);
            binary += ahora2;
            binary += binario2;
            
            //System.out.println("-------------------------------------------------------");
            
            String binario3 = "";
            if (numeros[3] > 0) {
                while (numeros[3] > 0) {
                    if (numeros[3] % 2 == 0) {
                        binario3 = "0" + binario3;
                    } else {
                        binario3 = "1" + binario3;
                    }
                    numeros[3] = (int) numeros[3] / 2;
                }
            } else if (numeros[3] == 0) {
                binario3 = "0";
            } else {

            }

            String cadenabinario3 = "0";
            String completo3 = binario3 + "";
            String ahora3 = "";
            while (completo3.length() < 8) {
                completo3 += cadenabinario3;
                ahora3 += cadenabinario;

            }

            
            //System.out.println("Cuarto numero:  " + ahora3 + binario3);
            binary += ahora3;
            binary += binario3;
            
            //System.out.println("-------------------------------------------------------");
            
            binarioImp.add(binary);
            
            
            return binario;
        }
        return "Trabajo realizado";

    }
     
     public static String  pin2(int [] numeros){
         String binary = "";
        for (int i = 0; i < numeros.length; i++) {

            String binario = "";
            if (numeros[0] > 0) {
                while (numeros[0] > 0) {
                    if (numeros[0] % 2 == 0) {
                        binario = "0" + binario;
                    } else {
                        binario = "1" + binario;
                    }
                    numeros[0] = (int) numeros[0] / 2;
                }
            } else if (numeros[0] == 0) {
                binario = "0";
            } else {

            }

            String cadenabinario = "0";
            String completo = binario + "";
            String ahora = "";
            while (completo.length() < 8) {
                completo += cadenabinario;
                ahora += cadenabinario;

            }

            //System.out.println("Primero numero " + ahora + binario);
            binary += ahora;
            binary += binario;
            //System.out.println("-------------------------------------------------------");
            
            
            String binario1 = "";
            if (numeros[1] > 0) {
                while (numeros[1] > 0) {
                    if (numeros[1] % 2 == 0) {
                        binario1 = "0" + binario1;
                    } else {
                        binario1 = "1" + binario1;
                    }
                    numeros[1] = (int) numeros[1] / 2;
                }
            } else if (numeros[1] == 0) {
                binario1 = "0";
            } else {

            }

            String cadenabinario1 = "0";
            String completo1 = binario1 + "";
            String ahora1 = "";
            while (completo1.length() < 8) {
                completo1 += cadenabinario1;
                ahora1 += cadenabinario;

            }

            
           // System.out.println("Segundo numero:  " + ahora1 + binario1);
            binary += ahora1;
            binary += binario1;
            
            //System.out.println("-------------------------------------------------------");
            
            
            String binario2 = "";
            if (numeros[2] > 0) {
                while (numeros[2] > 0) {
                    if (numeros[2] % 2 == 0) {
                        binario2 = "0" + binario2;
                    } else {
                        binario2 = "1" + binario2;
                    }
                    numeros[2] = (int) numeros[2] / 2;
                }
            } else if (numeros[2] == 0) {
                binario2 = "0";
            } else {

            }

            String cadenabinario2 = "0";
            String completo2 = binario2 + "";
            String ahora2 = "";
            while (completo2.length() < 8) {
                completo2 += cadenabinario2;
                ahora2 += cadenabinario;

            }

            
            //System.out.println("Tercer numero:  " + ahora2 + binario2);
            binary += ahora2;
            binary += binario2;
            
            //System.out.println("-------------------------------------------------------");
            
            String binario3 = "";
            if (numeros[3] > 0) {
                while (numeros[3] > 0) {
                    if (numeros[3] % 2 == 0) {
                        binario3 = "0" + binario3;
                    } else {
                        binario3 = "1" + binario3;
                    }
                    numeros[3] = (int) numeros[3] / 2;
                }
            } else if (numeros[3] == 0) {
                binario3 = "0";
            } else {

            }

            String cadenabinario3 = "0";
            String completo3 = binario3 + "";
            String ahora3 = "";
            while (completo3.length() < 8) {
                completo3 += cadenabinario3;
                ahora3 += cadenabinario;

            }

            
            //System.out.println("Cuarto numero:  " + ahora3 + binario3);
            binary += ahora3;
            binary += binario3;
            
            //System.out.println("-------------------------------------------------------");
            
            binarioImp2.add(binary);
            
            
            return binario;
        }
        return "Trabajo realizado";

    }
     
    
}

