package duke.choice;

public class Clothing {

    private String description;
    private double price;
    private String size = "M";
    final double MINIMUM_PRICE = 10.0;
    final double TAX = 0.2;

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
}
