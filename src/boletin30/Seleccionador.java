/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

/**
 *
 * @author FOLFO
 */
public class Seleccionador extends SeleccionFutbol {

    public Seleccionador() {
    }

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void seleccionarJugador() {
        System.out.println("Se seleccion un jugador");
    }

    @Override
    public void concentrarse() {
        System.out.println("se concentra el seleccionador");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el seleccionador");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el seleccionador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El seleccionador juega un partido");
    }

    @Override
    public String toString() {
        return "Seleccionador{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }

}
