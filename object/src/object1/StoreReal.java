package object;

import object1.Product;

import java.util.ArrayList;

public class StoreReal {
    public static void main(String[] args) {
        ArrayList<Product> list;
        list = new ArrayList<Product>();

        list.add(new Product(1, "Notebook",2000.00));
        list.add(new Product(2, "Mouse", 30.00));
        list.add(new Product(3, "Keyboard", 80.00));
        list.add(new Product(4, "Screen", 400.00));
        list.add(new Product(5,"Printer", 650.00));

//        for (Product p: list) {
//            System.out.println(p);
//        }

        list.remove(2);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
