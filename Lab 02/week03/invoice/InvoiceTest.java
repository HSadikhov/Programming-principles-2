package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        
        Invoice inv1 = new Invoice("1234", "Cordless Drill", 3, 79.99);

        System.out.println("--- Invoice 1 ---");
        System.out.println("Part Number: " + inv1.getPartNumber());
        System.out.println("Description: " + inv1.getPartDescription());
        System.out.println("Quantity: " + inv1.getQuantity());
        System.out.printf("Price per item: $%.2f%n", inv1.getPricePerItem());
        System.out.printf("Total Invoice Amount: $%.2f%n", inv1.getInvoiceAmount());

        
        System.out.println("\n--- Invoice 2 (Negative Initial Values) ---");
        Invoice inv2 = new Invoice("5678", "Hammer", -5, -12.50);

        System.out.println("Quantity: " + inv2.getQuantity());
        System.out.printf("Price per item: $%.2f%n", inv2.getPricePerItem());
        System.out.printf("Total Invoice Amount: $%.2f%n", inv2.getInvoiceAmount());

        
        System.out.println("\n--- Updating Invoice 2 via Setters ---");
        inv2.setQuantity(4);
        inv2.setPricePerItem(14.25);
        System.out.println("Updated Quantity: " + inv2.getQuantity());
        System.out.printf("Updated Price: $%.2f%n", inv2.getPricePerItem());
        System.out.printf("New Invoice Amount: $%.2f%n", inv2.getInvoiceAmount());
    }
}