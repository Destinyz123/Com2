
import java.util.Scanner;

class Product {

    String name;
    int weight;
    int price;

    Product(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    void printInfo() {
        System.out.println(weight + " grams of " + name + " costs " + price + " baht.");
    }
}

class PurchaseOrder {

    int allprice = 0;
    int allweight = 0;
    int amount;
    Product[] pds;
    int[] product;

    PurchaseOrder(int amount, Product[] pds, int[] product) {
        this.amount = amount;
        this.pds = pds;
        this.product = product;
        for (int i = 0; i < pds.length; i++) {
            this.allprice += this.pds[i].price * product[i];
            this.allweight += this.pds[i].weight * product[i];
        }
    }

    void printinfo() {
        System.out.println(amount + " items = " + allprice + " baht " + allweight + " grams");
        for (int i = 0; i < pds.length; i++) {
            System.out.println(pds[i].name + " " + product[i] + "x" + pds[i].price + " = " + product[i] * pds[i].price);
        }
    }
}

class Truck {

    int capacity;
    PurchaseOrder preo;
    int waypoint;
    double fee;

    Truck(int capacity) {
        this.capacity = capacity;
        this.waypoint = 0;
        this.fee = 0;
    }

    void add(PurchaseOrder preo, int waypoint) {
        this.preo = preo;
        this.waypoint = waypoint;
        setFee();
    }

    void setFee() {
        fee = ((double)preo.allweight  * waypoint)/1000;
    }

    double getFee() {
        return fee;
    }
}

public class ProductShipping1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        Truck[] trucks = new Truck[m];
        for (int i = 0; i < m; i++) {
            int capacity = in.nextInt();
            trucks[i] = new Truck(capacity);
        }
        int n = in.nextInt();
        int dest = in.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            products[i] = new Product(name, weight, price);
            amount[i] = in.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n, products, amount);
        int minvalue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < m; i++) {
            if ((trucks[i].capacity >= po.allweight) && (minvalue > trucks[i].capacity
            
                )){
 minvalue = trucks[i].capacity;
                minIndex = i;
            }
        }
        if (minIndex >= 0) {
            trucks[minIndex].add(po, dest);
            System.out.println("Truck#" + (minIndex + 1));
            System.out.println("Fee=" + trucks[minIndex].getFee());
        } else {
            System.out.println("No truck");
            System.out.println("Fee=" + po.allweight * dest / 1000.0);
        }
    }

}
