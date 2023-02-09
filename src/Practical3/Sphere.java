package Practical3;




public class Sphere {
    private double radius;
    
    public Sphere() {};
    public Sphere(double radius) {
        this.radius = radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double calculateArea(){
       return 4*Math.PI*Math.pow(radius, 2);
    }
    
    public double calculateVolume() {
        return 4.0/3.0*(Math.PI*(Math.pow(radius, 3)));
    }
}
