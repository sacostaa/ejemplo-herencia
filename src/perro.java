/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class perro extends Animal{

    public perro(String nombre, String raza) {
        super(nombre, raza);
    }
    @Override
    public void hacersonido(){
        System.out.println("guau");
    }
    
    
}
