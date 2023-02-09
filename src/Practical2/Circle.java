package Practical2;

public class Circle {
    private double radius = 1.0;
    public static int numberOfObject = 0; 
    
    public Circle() {
        
    }
    
    public Circle(double r) {
        radius = r;
    }
    
    public static int getNumberOfObject(){
        return numberOfObject;
    }
    
    public static void setNumberOfObject(int num) {
        numberOfObject = num;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
}
