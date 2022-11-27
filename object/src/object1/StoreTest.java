package object1;

import object1.Product;

public class StoreTest {
    public static void main(String[] args) {
        Product list[];
        list = new Product[5];
        //In this type of list, you can't add or delete elements. To do this you would have to reset the size and manually insert
        list[0] = new Product(1, "Notebook",2000.00);
        list[1] = new Product(2, "Mouse", 30.00);
        list[2] = new Product(3, "Keyboard", 80.00);
        list[3] = new Product(4, "Screen", 400.00);
        list[4] = new Product(5,"Printer", 650.00);

//        for(int i = 0; i < list.length; i++){
//            System.out.println(list[i]);
//        }

        //for-each: serves only to scroll through the list from beginning to end
        for (Product p: list) {
            System.out.println(p);
        }
    
    }
}