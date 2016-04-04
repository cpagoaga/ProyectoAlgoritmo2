/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planificadorcarga;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Horarios {
    int opcion;
    ArrayList<String> horarios = new ArrayList();
    Horarios(int horario){
        horarios.add("7:00 - 8:20");
        horarios.add("8:30 - 10:00");
        horarios.add("10:10 - 11:20");
        horarios.add("11:30 - 1:00");
        horarios.add("1:10 - 2:30");
        horarios.add("2:40 - 3:30");
        horarios.add("3:40 - 5:00");
        horarios.add("5:10 - 6:20");
        horarios.add("6:30 - 7:50");
        opcion=horario;
    }
}
