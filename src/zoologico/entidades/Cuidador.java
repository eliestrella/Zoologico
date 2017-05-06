/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoologico.entidades;

import java.util.Date;

/**
 *
 * @author educacionit
 */
public class Cuidador extends Persona  {
     private int cantidadDeRaciones;

     
    public int getCantidadDeRaciones() {
        return cantidadDeRaciones;
    }

    public void setCantidadDeRaciones(int cantidadDeRaciones) {
        this.cantidadDeRaciones = cantidadDeRaciones;
    }

    public Cuidador(String nombre, Date fechaNac, int cantidadDeRaciones) {
        super (nombre, fechaNac);
        this.cantidadDeRaciones = cantidadDeRaciones;
    }
     
    public void alimentarAnimales() {
        if((Zoologico.CANTIDAD_ANIMALES * Zoologico.ATRIBUTOS_POR_ANIMAL) <= cantidadDeRaciones){
            System.out.println("Alimenté Eureka");
        }
    }
}
