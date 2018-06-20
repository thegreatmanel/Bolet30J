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
public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void entrevista() {
        System.out.println("Entrevista al jugador");
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concentra el futbolista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el futbolista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista juega un partido");
    }

    @Override
    public String toString() {
        return "Futbolista{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

}
