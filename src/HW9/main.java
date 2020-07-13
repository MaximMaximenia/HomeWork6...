package HW9;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Product salt = new Product(2,"Соль",5);
        Product vodka = new Product(3,"Водка",34);
        Product water = new Product(8,"Вода",5);
        Product chips = new Product(5,"Чипс",77);
        Product fish = new Product(6,"Рыба",12);
        List<Product> sort = new ArrayList<>();
        Shop evroopt = new Shop();
       evroopt.addProduct(salt);
       evroopt.addProduct(vodka);
       evroopt.addProduct(water);
       evroopt.addProduct(chips);
       evroopt.addProduct(fish);



        System.out.println(evroopt.priceSortList()+"\n");
        evroopt.removeProduct(2);
        System.out.println(evroopt.sortByLastAddToList());
        vodka.setName("РУССКАЯ водка");
        evroopt.allProductInfo();
    }
}
