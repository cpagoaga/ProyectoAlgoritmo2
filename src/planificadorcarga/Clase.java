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
public class Clase {
    Horarios horario;
    Maestro maestro;
    String Nombre;
    ArrayList<Alumno> alumnos = new ArrayList();
    Aula aula;
    String Carrera;
    public Clase(Horarios horario, Maestro maestro, String Nombre, Aula Aula,String Carrera) {
        this.horario = horario;
        this.maestro = maestro;
        this.Nombre = Nombre;
        this.aula= Aula;
        this.Carrera=Carrera;
    }

    @Override
    public String toString() {
        return Nombre;
    }

    public Horarios getHorario() {
        return horario;
    }

    public void setHorario(Horarios horario) {
        this.horario = horario;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno alumno) {
        this.alumnos.add(alumno);
    }
    
    
}
