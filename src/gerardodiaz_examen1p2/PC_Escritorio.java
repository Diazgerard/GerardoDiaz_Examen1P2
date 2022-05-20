/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardodiaz_examen1p2;

/**
 *
 * @author gerar
 */
public class PC_Escritorio extends PC{
    
    private int ram;
    private int capacidad;
    private String almacimiento;
    private String grafica;

    public PC_Escritorio() {
        super();
    }

    public PC_Escritorio(int ram, int capacidad, String almacimiento, String grafica) {
        this.ram = ram;
        this.capacidad = capacidad;
        this.almacimiento = almacimiento;
        this.grafica = grafica;
    }

    public PC_Escritorio(int ram, int capacidad, String almacimiento, String grafica, String IP, String mascara, String hostname) {
        super(IP, mascara, hostname);
        this.ram = ram;
        this.capacidad = capacidad;
        this.almacimiento = almacimiento;
        this.grafica = grafica;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getAlmacimiento() {
        return almacimiento;
    }

    public void setAlmacimiento(String almacimiento) {
        this.almacimiento = almacimiento;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }
    
    
    
}
