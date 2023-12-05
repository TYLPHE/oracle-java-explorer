package duke.choice;

public class Customer {
    private String name;
    private String size;

    // Exercise 5.3
    private Clothing[] items;

    public void addItems(Clothing[] items) {
        this.items = items;
    }

    public void getClothingItems() {
        for (Clothing item : items) {
            System.out.println("item = " + item.getDescription());
        }
    }

    public double getTotalClothingCost() {
        double total = 0;
        for (Clothing item : items) {
            total += item.getPrice();
            if (total > 15) {
                break;
            }
        }

        return total;
    }

    // Exercise 5.1
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Exercise 5.2
    public void setSize(int size) {
        // Exercise 4.1
        switch (size) {
            case 1, 2, 3 -> setSize("S");
            case 4, 5, 6 -> setSize("M");
            case 7, 8, 0 -> setSize("L");
            default -> setSize("X");
        }
    }
}
