/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public abstract class  Animal {
    
    protected String nombre;
    protected String raza;

    public Animal(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }
    
    public abstract void hacersonido();
    public void correr (){
        System.out.println("corriendo");
    };
    
}
