package ss5_accessmodifier_staticmethoc_staticproperty.bai_tap.bai_tap_3.quan_ly_san_pham_crud;

import java.text.DecimalFormat;

public class Product {
    private static int nextId = 1;
    private int id;
    private String name;
    private double price;

    Product(String name, double price) {
        this.id = nextId++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,###");
        return "List{" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", price= " + df.format(price) + " VNĐ" +
                '}';
    }
}
