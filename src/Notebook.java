import java.util.*;

public class Notebook {
    private int id;
    private String maker;
    private String os;
    private String color;
    private int ram;
    private int price;

    public Notebook(int id, String maker, String os, String color, int ram, int price) {
        this.id = id;
        this.maker = maker;
        this.os = os;
        this.color = color;
        this.ram = ram;
        this.price = price;
    }

    public String toString() {
        return "\n id: " + id
                + " maker: " + maker
                + " OS: " + os
                + " color: " + color
                + " RAM: " + ram
                + " price: " + price + "$";
    }

    public int getId() {
        return this.id;
    }

    public String getMaker() {
        return this.maker;
    }

    public String getOs() {
        return this.os;
    }

    public String getColor() {
        return this.color;
    }

    public int getRam() {
        return this.ram;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Notebook)) {
            return false;
        }
        Notebook book = (Notebook) o;
        return maker.equals(book.maker)
                && os.equals(book.os)
                && color.equals(book.color)
                && ram == book.ram
                && price <= book.price;
    }
}


