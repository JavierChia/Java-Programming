package Practical3;

public class TestEmployee {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new CasualEmployee("John", 10.0, 30);
        employees[1] = new CasualEmployee("Mary", 5.0, 50);
        employees[2] = new Manager("Peter", 3000.0, 5000.0);
        TestEmployee t = new TestEmployee();
        t.displaySalary(employees);
//        displaySalary(employees);
    }

    public void displaySalary(Employee[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println("Name: " + e[i].getName() + "\nSalary: " + e[i].calcSalary() + "\n");
        }
    }
}
