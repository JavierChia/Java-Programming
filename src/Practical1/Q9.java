package Practical1;

public class Q9 {

    public static void main(String[] argc) {
        int i;
        int [] numberArray = new int[100];
        System.out.println("-= Display contents of numberArray[] =-");
        for (i = 0; i <numberArray.length; i++){
            if (i%2==0) {
                numberArray[i] = 1;
            }
            else {
                numberArray[i]= 2;
            }
            System.out.println("numberArray[" + i + "] = " + numberArray[i]);
        }
    }
}