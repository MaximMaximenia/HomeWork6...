package HW9;

import java.util.*;

public class Shop {
    int count = 0;
    int go = 0;
    ArrayList<Product> productsList = new ArrayList();

    public void addProduct(Product product) {
        if (idCheck(product)) {
            productsList.add(product);
            System.out.println("ПРОДУКТ \"" + product.getName() + "\" ДОБАВЛЕН.");
        } else {
            System.out.println("ПРОДУКТ С ТАКИМ ID УЖЕ ЕСТЬ!!!");
        }
    }



    public boolean idCheck(Product product) {
        boolean b = false;
        int count = 0;
        if (productsList.isEmpty()) {
            b = true;
        } else {
            for (int i = 0; i < productsList.size(); i++) {
                Product p = productsList.get(i);
                if (product.getId() == p.getId()) {
                    count++;
                }


            }
            if (count > 0) {
                b = false;
            } else {
                b = true;

            }

        }
        return b;
    }

    public void allProductInfo() {
        System.out.println("----------------------------------------------------");
        System.out.println("ВСЕ ПРОДУКТЫ В МАГАЗИНЕ:");
        System.out.println();
        for (Product p : productsList) {
            System.out.print(p.toString());
        }
        System.out.println("-----------------------------------------------------");
    }


    public void removeProduct(int id) {
        int x = 0;
        for (int i = 0; i < productsList.size(); i++) {
            Product p = productsList.get(i);
            if (id == p.getId()) {
                productsList.remove(i);
                x++;
            }
        }
        if (x == 0) {
            System.out.println("ТОВАР С ТАКИМ ID НЕ НАЙДЕН.");
        } else {
            System.out.println("ТОВАР С ID " + id + " УСПЕШНО УДАЛЕН.");
        }
    }
     List<Product> priceSortList() {
        List<Product> priceSortList = new ArrayList(productsList);
        priceSortList.sort((product1, product2) -> product2.getPrice() - product1.getPrice());
        return priceSortList;
    }
    List<Product> sortByLastAddToList() {
        List<Product> sortByLastAddToList = new ArrayList<>();
        for (int i = productsList.size(); i > 0; i--) {
            sortByLastAddToList.add(productsList.get(i - 1));
        }
        return sortByLastAddToList;
    }


}




