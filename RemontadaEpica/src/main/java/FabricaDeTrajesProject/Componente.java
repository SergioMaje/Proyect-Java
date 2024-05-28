/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricaDeTrajesProject;

import java.util.Objects;

/**
 *
 * @author majes
 */
public class Componente {
    int id;
    String nombre; 
    String talla;
    String color;
    boolean esComunitario;
    double precio;

    public Componente(int id, String nombre, String talla, String color, boolean esComunitario, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.esComunitario = esComunitario;
        this.precio = precio;
    }

    Componente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Componente(int tipo, int id, String nombre, String talla, String color, boolean esComunitario, double precio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEscomunitario() {
        return esComunitario;
    }

    public void setEscomunitario(boolean escomunitario) {
        this.esComunitario = escomunitario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Componente{" + "id=" + id + ", nombre=" + nombre + ", talla=" + talla + ", color=" + color + ", escomunitario=" + esComunitario + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        hash = 17 * hash + Objects.hashCode(this.talla);
        hash = 17 * hash + Objects.hashCode(this.color);
        hash = 17 * hash + (this.esComunitario ? 1 : 0);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Componente other = (Componente) obj;
        if (this.id != other.id) {
            return false;
        }
        return false;
    }
        public int compareTo(Componente other) {
            return Integer.compare(this.id, other.id);
       }
    }

