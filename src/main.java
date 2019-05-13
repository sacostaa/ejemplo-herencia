/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class main {
 
    public static void main(String[] args) {
        
        Animal p1  = new perro ("kira", "pincher") ;
        
        p1.hacersonido();
        p1.correr();
        
        Animal g1 = new gato ("manchas", "raza");
        g1.hacersonido();
        p1.correr();
        
    }
}
