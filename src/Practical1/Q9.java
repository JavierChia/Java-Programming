package Practical1;


public class Q9 {

    public static void main(String[] argc) {
        int i,oddEven;
        System.out.println("-= Display contents of numberArray[] =-");
        for (i = 0; i < 100; i++){
            if (i%2==0) {
                oddEven = 1;
            }
            else {
                oddEven = 2;
            }
            System.out.println("numberArray[" + i + "] = " + oddEven);
        }
    }
}
