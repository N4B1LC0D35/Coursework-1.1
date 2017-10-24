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
public class Circle extends TwoDShape {
    private final double _radius;

    public Circle(String name ,double radius) {
        super(1,name);
        _radius = radius;
    }
        
        public void displayDescription(){
        super.displayDescription();
        System.out.println("I'm also a circle");
    }
       
        public double getArea() {
        
        return 2 * (3.14) * _radius;
        
    }
      
        public double getPerimeter() {
        
        return  2 * (3.14) * _radius;
    }

   

   
    }
    
    

