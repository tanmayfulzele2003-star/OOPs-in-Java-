class Account {
    double balance;

    // no-argument constructor
    Account() {
        balance = 0;
    }

    // parameterized constructor
    Account(double b) {
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Account a = new Account(1000);

        a.deposit(500);
        a.withdraw(300);
        a.display();
    }
}
