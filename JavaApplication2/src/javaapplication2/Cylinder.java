/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;

/**
 *
 * @author M00555527
 */
public class Cylinder extends ThreeDShape{
    private double _radius;
    private double _height;

    public Cylinder(String name, double radius, double height) {
        super(name,2);
        _radius = radius;
        _height = height;
    
    }
     
    @Override
    public void displayDescription() {
        super.displayDescription();
        System.out.println("\tI'm also a cylinder");
    }
    
    @Override
    public double getVolume(){
        return Math.PI*Math.pow(_radius, 2)*_height;
    } 
    
    @Override
    public double getSA(){
        return 2*Math.PI*_radius*(_radius+_height);

    }   

    
}

