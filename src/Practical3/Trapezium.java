package Practical3;



public class Trapezium {
        private double base, top, height;
        
        public Trapezium(double b, double t, double h) {
            base = b;
            top = t;
            height = h;
        }
        
        public double getArea(){
            return (base + top) * height / 2;
        }
        
        public double getBase() {
            return base;
        }
        
        public double getTop() {
            return top;
        }
        
        public double getHeight() {
            return height;
        }
}
