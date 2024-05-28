/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaDeTrajesProject;

/**
 *
 * @author majes
 */
public class Chaqueta {
    int numBotones;

    public Chaqueta(int numBotones) {
        this.numBotones = numBotones;
    }

    public int getNumBotones() {
        return numBotones;
    }

    public void setNumBotones(int numBotones) {
        this.numBotones = numBotones;
    }

    @Override
    public String toString() {
        return "Chaqueta{" + "numBotones=" + numBotones + '}';
    }
    
    
}
