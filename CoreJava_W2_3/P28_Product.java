import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P28_Product {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 50000));
        products.add(new Product("Phone", 30000));
        products.add(new Product("Tablet", 20000));

        // Sort by name
        Collections.sort(products, new SortByName());
        System.out.println("Sorted by Name:");
    
        for (Product p : products) {
            p.print();
        }
        // Sort by price
        Collections.sort(products, new SortByPrice());
        System.out.println("\nSorted by Price:");

        for (Product p : products) {
            p.print();
        }

    }
}

class Product{
    String name;
    double price;
    Product(String name,double price){
        this.name=name;
        this.price=price;
    }

    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

     public void print() {
        System.out.println(name + " - " + price);
    }
}


class SortByName implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().compareTo(p2.getName());
    }
}


class SortByPrice implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}
