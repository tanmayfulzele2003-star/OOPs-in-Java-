class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}

class Employee extends Person {
    int empId;
    double salary;

    Employee(String n, int a, int id, double s) {
        super(n, a); // initialize parent class
        empId = id;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Amit", 30, 101, 50000);
        e.display();
    }
}
