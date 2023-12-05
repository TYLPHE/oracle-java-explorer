package duke.choice;

public class Main {
    public static void main(String[] args) {

        final double TAX = 0.2;
        double total;
        int measurement = 3;

        System.out.println("Welcome to Duke Choice Shop");
        
        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";
        System.out.println("c1.name = " + c1.name);

        switch (measurement) {
            case 1, 2, 3 -> c1.size = "S";
            case 4, 5, 6 -> c1.size = "M";
            case 7, 8, 0 -> c1.size = "L";
            default -> c1.size = "X";
        }

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        System.out.println("item1 = " + item1.description + ", $" + item1.price + ", Size:" + item1.size);
        System.out.println("item2 = " + item2.description + ", $" + item2.price + ", Size:" + item2.size);

        System.out.println("Two T-Shirts and one Jacket ordered.");
        total = item1.price + item2.price * 2 + ((item1.price + item2.price * 2) * TAX);
        System.out.println("total = " + total);
    }
}
