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
        c1.setName("Pinky");
        c1.setSize(3);
        System.out.println("c1.getName() = " + c1.getName());

        // Exercise 3.3
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();

        // Exercise 4.2
        Clothing[] items = {item1, item2, item3, item4};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        item3.setDescription("Green Scarf");
        item3.setPrice(5);
        item3.setSize("S");

        item4.setDescription("Blue T-Shirt");
        item4.setPrice(10.5);
        item4.setSize("S");

        // Exercise 4.3
//        System.out.println("item1 = " + item1.description + ", $" + item1.price + ", Size:" + item1.size);
//        System.out.println("item2 = " + item2.description + ", $" + item2.price + ", Size:" + item2.size);
//        total = item1.price + item2.price * 2 + ((item1.price + item2.price * 2) * TAX);
        for (Clothing item : items) {
            if (item.getSize().equals(c1.getSize())) {
                System.out.println(item.getDescription() + ", $" + item.getPrice() + ", Size:" + item.getSize());
//                total += item.getPrice() * (1 + TAX);
                total += item.getPrice();
                if (total > 15) {
                    break;
                }
            }
        }
        System.out.println("total = $" + total);

        item4.setPrice(1);
    }
}
