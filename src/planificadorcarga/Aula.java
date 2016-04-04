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
public class Aula {
    int Edificio;
    int Aula;
    Aula(int edificio, int aula){
        Edificio = edificio;
        Aula = aula;
    }

    @Override
    public String toString() {
        return Edificio + "-" + Aula;
    }
    
}
