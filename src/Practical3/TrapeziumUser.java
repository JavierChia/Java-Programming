package Practical3;



public class TrapeziumUser {
    public static void main(String[] args) {
        Trapezium x = new Trapezium(6,5,4);

        System.out.println("Trapezium class program started.\n");
        System.out.println("This trapezium has base value " + x.getBase());
        System.out.println("This trapezium has top value " + x.getTop());
        System.out.println("This trapezium has height value " + x.getHeight());
        System.out.println("\nThe area of the trapezium is " + x.getArea());
        System.out.println("\nTrapezium class program terminated.");

    }
    
}
