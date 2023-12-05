package duke.choice;

public class Main {
    public static void main(String[] args) {

        final double TAX = 0.2;
        double total = 0;
        int measurement = 3;

        // Exercise 3.1
        System.out.println("Welcome to Duke Choice Shop");
        System.out.println("Tax rate is " + Clothing.TAX + ", Min price is $" + Clothing.MINIMUM_PRICE);
        // Exercise 3.2
        Customer c1 = new Customer("Pinky", 3);
//        c1.setName("Pinky");
//        c1.setSize(3);
        System.out.println("c1.getName() = " + c1.getName() + ", Size = " + c1.getSize());

        // Exercise 3.3
        Clothing item1 = new Clothing("Blue Jacket", 10.5, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 15, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        // Exercise 4.2
        Clothing[] items = {item1, item2, item3, item4};
//
//        item1.setDescription("Blue Jacket");
//        item1.setPrice(20.9);
//        item1.setSize("M");
//
//        item2.setDescription("Orange T-Shirt");
//        item2.setPrice(10.5);
//        item2.setSize("S");
//
//        item3.setDescription("Green Scarf");
//        item3.setPrice(5);
//        item3.setSize("S");
//
//        item4.setDescription("Blue T-Shirt");
//        item4.setPrice(10.5);
//        item4.setSize("S");

        // Exercise 4.3
//        System.out.println("item1 = " + item1.description + ", $" + item1.price + ", Size:" + item1.size);
//        System.out.println("item2 = " + item2.description + ", $" + item2.price + ", Size:" + item2.size);
//        total = item1.price + item2.price * 2 + ((item1.price + item2.price * 2) * TAX);
//        for (Clothing item : items) {
//            if (item.getSize().equals(c1.getSize())) {
//                System.out.println(item.getDescription() + ", $" + item.getPrice() + ", Size:" + item.getSize());
//                total += item.getPrice() * (1 + TAX);
//                total += item.getPrice();
//                if (total > 15) {
//                    break;
//                }
//            }
//        }
//        System.out.println("total = $" + total);

        c1.addItems(items);
        c1.getClothingItems();
        System.out.println("total = $" + c1.getTotalClothingCost());

        item4.setPrice(1);

        // Exercise 7.1 Catch exception
        c1.averagePrice();
    }
}
