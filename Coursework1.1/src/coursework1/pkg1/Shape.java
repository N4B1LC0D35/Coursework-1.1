/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1.pkg1;

/**
 *
 * @author M00555527
 */
public abstract class Shape {
    final int _numberOfSides;
    final String _name;
    
    public Shape(int numberOfSides, String name) {
        _numberOfSides = numberOfSides;
        _name = name;
    }
    
    public abstract double getArea();
    
    public abstract double getPerimeter();
    
    public void displayDescription(){
        System.out.println("I'm a Shape name " + _name);
        
    }
   
    
            
    
}
