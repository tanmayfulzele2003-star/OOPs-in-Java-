import java.util.*;

class Product {
    int pid;
    int price;
    int quantity;

    Product(int id, int p, int q) {
        pid = id;
        price = p;
        quantity = q;
    }
}

public class ProductMain {

    // method to calculate total amount
    static int totalAmount(Product arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].price * arr[i].quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] p = new Product[5];

        // input
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter pid, price, quantity:");
            int id = sc.nextInt();
            int price = sc.nextInt();
            int qty = sc.nextInt();
            p[i] = new Product(id, price, qty);
        }

        // find highest price product
        int maxPrice = p[0].price;
        int maxPid = p[0].pid;

        for (int i = 1; i < 5; i++) {
            if (p[i].price > maxPrice) {
                maxPrice = p[i].price;
                maxPid = p[i].pid;
            }
        }

        System.out.println("Product with highest price PID: " + maxPid);

        // total amount
        System.out.println("Total amount spent: " + totalAmount(p));
    }
}
