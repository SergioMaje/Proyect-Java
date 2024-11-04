/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author majes
 */
/**
 *
 * @author majes
 * Proyecto coches Matriculados.
Crear la clase Coche con :
• Atributos:
- String marca: se inicializa en el constructor y no se modifica nunca
- String color: se inicializa en el constructor y se puede modificar
- int km: al principio vale 0, y se puede incrementar
- double precio: se inicializa en el constructor y se puede modificar
- double factor_contaminación: se inicializa en el constructor y no se puede modificar
- int anio : se inicializa en el constructor y no se puede modificar
- String matricula: no se inicializa con el constructor, y una vez que se le ha dado un valor, no
se puede cambiar.
- String dniTitular: no se inicializa con el constructor, se puede cambiar después.
• Métodos:
- comprarCoche(Coche otroCoche), que cambia el atributo dniTitular por el dniTitular del
parámetro otroCoche. Sólo se puede hacer el cambio si ambos coches (el propio objeto y el
parámetro del método) tienen valor en el campo dniTitular
Crear la clase Cochematriculado que hereda de coche, con :
• Atributos:
- int aniomatriculacion
- int mesmatriculacion
- double impuestoMatriculacion, no se crea con el coche, se puede cambiar después.
• Métodos
- método calculaImpuestoMatriculacion(), que calcula y asigna al atributo correspondiente
el impuesto de matriculación (que será la vigésima parte del precio del coche), y aplica un
recargo de 100 euros si el coche tiene más de 10 años
- constructor: recibe valor para asignar a los atributos matricula y dniTitular, y calcula con el
método calculaImpuestoMatriculacion() el atributo correspondiente
- Métodos getter y setter. El setter de impuestoMatriculacion debe usar el método
calculaImpuestoMatriculacion() para calcular el atributo correspondiente, por lo que no
tiene parámetros
Crear una clase con un main y probar a crear objetos de ambas clases y probar sus métodos.
 */
class Coche {
    // Atributos
    private String marca;
    private String color;
    private int km;
    private double precio;
    private final double factor_contaminacion;
    private final int anio;
    private String matricula;
    private String dniTitular;

    // Constructor
    public Coche(String marca, String color, double precio, double factor_contaminacion, int anio) {
        this.marca = marca;
        this.color = color;
        this.km = 0;
        this.precio = precio;
        this.factor_contaminacion = factor_contaminacion;
        this.anio = anio;
    }

    // Métodos
    public void comprarCoche(Coche otroCoche) {
        if (this.dniTitular != null && otroCoche.dniTitular != null) {
            this.dniTitular = otroCoche.dniTitular;
        }
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getFactorContaminacion() {
        return factor_contaminacion;
    }

    public int getAnio() {
        return anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (this.matricula == null) {
            this.matricula = matricula;
        }
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }
}
