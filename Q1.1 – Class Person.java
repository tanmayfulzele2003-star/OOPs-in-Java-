class Person {
    String name;
    int age = 18; // default age

    // parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ramesh", 20);
        p1.display();
    }
}
