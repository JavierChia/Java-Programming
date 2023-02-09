package Practical2;

public class TestCircle {

    public static void main(String[] args) {
        Circle c1;
        c1 = new Circle();
        double a = c1.getArea();
        System.out.println("c1 radius = " + c1.getRadius());
        System.out.println("c1 area = " + a);

        Circle c2 = new Circle(2);
        System.out.println("c2 radius = " + c2.getRadius());
        System.out.println("c1 area = " + c2.getArea());

        System.out.println("--------------------------------");
        c1.getRadius();
        c1.setNumberOfObject(5);

        System.out.println("c1 radius = " + c1.getRadius());
        System.out.println("c2 radius = " + c2.getRadius());
        System.out.println("c1 number of objects = " + c1.getNumberOfObject());
        System.out.println("c2 number of objects = " + c2.getNumberOfObject());
    }
}
