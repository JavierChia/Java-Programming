package Practical6;

import java.io.*;
import javax.swing.JOptionPane;

public class PersonUser {

    public void saveObject() {
        File f = new File("Person.dat");
        Person p = new Person("John", 35, 5999.9);
        try {
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(f));
            outStream.writeObject(p);
            outStream.close(); //do not forget this line
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void readObject() {
        File f = new File("Person.dat");
        try {
            ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(f));
            Person inPerson = (Person) inStream.readObject();
            System.out.println("Name: " + inPerson.getName());
            System.out.println("Age: " + inPerson.getAge());
            System.out.println("Salary: " + inPerson.getSalary());
            inStream.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        PersonUser pu = new PersonUser();
//        pu.saveObject();
        pu.readObject();
    }
}
