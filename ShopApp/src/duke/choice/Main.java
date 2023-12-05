package duke.choice;

public class Main {
    public static void main(String[] args) {

        final double TAX = 0.2;
        double total = 0;
        int measurement = 3;

        // Exercise 3.1
        System.out.println("Welcome to Duke Choice Shop");

        // Exercise 3.2
        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";
        System.out.println("c1.name = " + c1.name);

        // Exercise 4.1
        switch (measurement) {
            case 1, 2, 3 -> c1.size = "S";
            case 4, 5, 6 -> c1.size = "M";
            case 7, 8, 0 -> c1.size = "L";
            default -> c1.size = "X";
        }

        // Exercise 3.3
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        // Exercise 4.2
        Clothing[] items = {item1, item2, item3, item4};

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        item3.description = "Green Scarf";
        item3.price = 5;
        item3.size = "S";

        item4.description = "Blue T-Shirt";
        item4.price = 10.5;
        item4.size = "S";

        // Exercise 4.3
//        System.out.println("item1 = " + item1.description + ", $" + item1.price + ", Size:" + item1.size);
//        System.out.println("item2 = " + item2.description + ", $" + item2.price + ", Size:" + item2.size);
//        total = item1.price + item2.price * 2 + ((item1.price + item2.price * 2) * TAX);
        for (Clothing item : items) {
            if (item.size.equals(c1.size)) {
                System.out.println(item.description + ", $" + item.price + ", Size:" + item.size);
                total += item.price * (1 + TAX);
                if (total > 15) {
                    break;
                }
            }
        }
        System.out.println("total = $" + total);
    }
}
