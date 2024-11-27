/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploperr;

/**
 *
 * @author rb940
 */
//creamos la clase Perro
class Perro {
    // Atributos de la clase Perro
    String raza;
    String altura;
    String color ;

    // Constructor: Se utiliza para inicializar un objeto de tipo Perro
    public Perro(String raza, String altura, String color) {
        this.raza = raza;
        this.altura = altura ;
        this.color = color ;
    }

    // Método: Acción de perro herido
    public void herido() {
        System.out.println("El perro " + raza + " " + "de "+ altura + " " + "de color " + color + " " + " esta herido.");
    }

    // Método: Acción de perro sano
    public void sano() {
        System.out.println("El perro " + raza + " "+ "de " + altura + " " + "de color "+ color + " " + " esta sano.");
        
        
    }
}
public class Ejemploperr {

     public static void main(String[] args) {
        // Creación de un objeto de la clase Perro
        Perro miPerro = new Perro("Grandanes", "50cm", "gris");

        // Usamos los métodos del objeto miPerro
        miPerro.herido();  // Llamamos al método herido
        miPerro.sano();   // Llamamos al método sano
    }
}
