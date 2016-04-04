/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planificadorcarga;

/**
 *
 * @author Carlos
 */
public class Alumno {
    String Nombre;
    int numeroCuenta;
    String Carrera;
    public Alumno(String Nombre, int numeroCuenta, String Carrera) {
        this.Nombre = Nombre;
        this.numeroCuenta = numeroCuenta;
        this.Carrera=Carrera;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
