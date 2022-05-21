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
public class Laptop extends PC{
    
    private String marca;
    private String pantalla;
    private String RGB;

    public Laptop() {
        super();
    }

    public Laptop(String marca, String pantalla, String RGB) {
        this.marca = marca;
        this.pantalla = pantalla;
        this.RGB = RGB;
    }

    public Laptop(String marca, String pantalla, String RGB, String IP, String mascara, String hostname) {
        super(IP, mascara, hostname);
        this.marca = marca;
        this.pantalla = pantalla;
        this.RGB = RGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getRGB() {
        return RGB;
    }

    public void setRGB(String RGB) {
        this.RGB = RGB;
    }

//    @Override
//    public String toString() {
//        return super.toString() + "Laptop{" + "marca=" + marca + ", pantalla=" + pantalla + ", RGB=" + RGB + '}';
//    }
    
    
    
    
    
}
