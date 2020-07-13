package HW9;

public class Product {
    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "ПРОДУКТ \""+ name + "\" ИМЕЕТ ID:"+id+ " И СТОИТ :"+price+" $.\n";

    }

    public String getName() {
        return name;
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }
}

