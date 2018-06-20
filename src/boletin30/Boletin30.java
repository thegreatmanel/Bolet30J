/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

import java.util.ArrayList;

/**
 *
 * @author FOLFO
 */
public class Boletin30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> equipo = new ArrayList();
        equipo.add(new Futbolista(10, "delantero", 1, "Paco", "Paquinez", 19));
        equipo.add(new Entrenador(88, 2, "Luis", "Pérez", 36));
        equipo.add(new Masajista("Deportivo", 2, 3, "Manu", "mierder", 16));
        equipo.add(new Seleccionador(4, "Quique", "Leon", 56));

        for (int i = 0; i < equipo.size(); i++) {
            System.out.println(equipo.get(i));
        }
        
    }
    
}
