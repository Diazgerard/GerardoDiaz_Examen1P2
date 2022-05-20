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
public class PC {
    
    private String IP;
    private String mascara;
    private String hostname;

    public PC() {
    }

    public PC(String IP, String mascara, String hostname) {
        this.IP = IP;
        this.mascara = mascara;
        this.hostname = hostname;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    
    
}
