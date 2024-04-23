/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author majes
 */

/*
Una clínica de maternidad necesita un sistema para determinar cuántos bebés han nacido
recientemente. Dicho sistema solicita al usuario capturar la cantidad de nacimientos (N), el
nombre de cada bebé y su sexo (implemente un ciclo do-while para validar la captura, siendo M
para masculino y F para femenino). Al final, debe imprimir la cantidad de bebés de cada sexo.
*/
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Para que el usuario ingrese la cantidad de BB
        System.out.print("Cuantos bebes va a procesar: ");
        int numBb = sc.nextInt();
        sc.nextLine();
        //Para guardar los datos de los bb se declara un arreglo String de columna
        //En la primera columna se guarda el nombre del BB y el segunda el sexo
        String[][] bebes = new String[numBb][2];
        //Ciclo para capturar los datos de los BB
        for(int i=0;i<bebes.length;i++){
            /*
            System.out.println("Bebe # "+(i+1));
            System.out.print("Nombre: ");
            bebes[i][0]=sc.nextLine();
            //Para capturar el sexo
            String sexo="";
            while(!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("F")){
                System.out.print("Indique el sexo F o M:");
                sexo=sc.nextLine();
            }
            bebes[i][1]=sexo;
            
            /*
            Para llenar los arreglos de datos aleatorios para pruebas
            */
            char letraAl1 =  (char) ((int) (Math.random() * (90 - 65)) + 65);
            bebes[i][0]=String.valueOf(letraAl1);
            //int sexoAl1
            if((int)(Math.random() * 10)%2==0)
                bebes[i][1]="M";
            else
                bebes[i][1]="F";
            System.out.println("Letra: "+letraAl1);
            System.out.println("Bebe # "+(i+1)+" Nombre: "+bebes[i][0]+" Sexo: "+bebes[i][1]);
        }
        //String[][] b;
        //Se recorre la matriz para determinar la cantidad por sexo
        int cantM=0,cantF=0;
        for (String[] b:bebes){
            if (b[1].equalsIgnoreCase("M"))
                cantM++;
            else
                cantF++;
        }
        System.out.println("Cantidad M:"+cantM);
        System.out.println("Cantidad F:"+cantF);
        
        
        
    }

    
    
    
}

