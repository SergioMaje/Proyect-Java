/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaDeTrajesProject;

/**
 *
 * @author majes
 */
public class Pantalon {
    boolean conCremallera;

    public Pantalon(boolean conCremallera) {
        this.conCremallera = conCremallera;
    }

    public boolean isConCremallera() {
        return conCremallera;
    }

    public void setConCremallera(boolean conCremallera) {
        this.conCremallera = conCremallera;
    }

    @Override
    public String toString() {
        return "Pantalon{" + "conCremallera=" + conCremallera + '}';
    }
    
    
}
