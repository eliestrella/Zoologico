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
public class Zoologico {

    public static final int CANTIDAD_ANIMALES = 25;
    public static final int ATRIBUTOS_POR_ANIMAL = 5;
    private boolean abierto;

    public void abrir() {
        this.abierto = true;
    }

    public void alimentarAnimales(int cantidadDeRaciones) {
        Cuidador c = new Cuidador("Juan", new Date(1976, 10, 9), cantidadDeRaciones);
        c.alimentarAnimales();
    }

    public void cerrar() {
        this.abierto = false;
    }

}
