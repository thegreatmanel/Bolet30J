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
public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int anhosExp;

    public Masajista() {
    }

    public Masajista(String titulacion, int anhosExp, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anhosExp = anhosExp;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnhosExp() {
        return anhosExp;
    }

    public void setAnhosExp(int anhosExp) {
        this.anhosExp = anhosExp;
    }

    public void darMasaje() {
        System.out.println("Se da un masaje");
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concentra el Masajista");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el masajista");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el masajista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista juega un partido y mete un golazo por la escuadra ganando el mundial en el ultimo minuto");
    }

    @Override
    public String toString() {
        return "Masajista{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "titulacion=" + titulacion + ", anhosExp=" + anhosExp + '}';
    }

}