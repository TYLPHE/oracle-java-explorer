package duke.choice;

public class Clothing implements Comparable<Clothing>{

    private String description;
    private double price;
    private String size = "M";
    // Exercise 6.3
    static final double MINIMUM_PRICE = 10.0;
    static final double TAX = 0.2;

    // Exercise 6.2
    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        setSize(size);
    }

    // Exercise 8.1 override and polymorphism
    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

    // Exercise 5.1
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + price * TAX;
    }

    public void setPrice(double price) {
        if (price > MINIMUM_PRICE) {
            this.price = price;
        } else {
            System.out.println("Price cannot be lower than " + MINIMUM_PRICE);
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Exercise 8.2
    @Override
    public int compareTo(Clothing c) {
        return this.description.compareTo(c.description);
    }
}
