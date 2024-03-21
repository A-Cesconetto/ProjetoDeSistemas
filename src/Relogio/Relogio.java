/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relogio;

/**
 *
 * @author aluno
 */
public class Relogio {
    public static void main(String[] args) {
        Display relogio = new Display (16, 30);
        
        relogio.tiqueTaque();
        System.out.println("Hora atual:" + relogio.getHora());
        
        relogio.tiqueTaque();
        System.out.println("Hora atual:" + relogio.getHora());
        
        relogio.tiqueTaque();
        System.out.println("Hora atual:" + relogio.getHora());
    }
    
}
