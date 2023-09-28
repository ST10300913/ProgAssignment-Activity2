/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbakery;

import java.util.Scanner;

/**
 Activity 2
 */
public class ProjectBakery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
            BakeryOrder order = new BakeryOrder(10);
        System.out.println("Welcome to the Bakery!");
        System.out.println("Menu:");
        System.out.println("1. Fresh Sourdough Loaf - R32");
        System.out.println("2. 6 Cupcakes - R15");
        System.out.println("3. Large Cappuccino - R32");
        System.out.println("4. Regular Cappuccino - R26");
        System.out.println("5. 32 Biscuits - R50");

        System.out.print("Enter the number of items you want to order: ");
        int maxItems = scanner.nextInt();
       
        

        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < maxItems; i++) {
            System.out.print("Enter item choice (1-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            BakeryProduct item = null;

            switch (choice) {
                case 1:
                    item = new SourdoughLoaf();
                    break;
                case 2:
                    item = new Cupcakes();
                    break;
                case 3:
                    item = new LargeCappuccino();
                    break;
                case 4:
                    item = new RegularCappuccino();
                    break;
                case 5:
                    item = new Biscuits();
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid item.");
            }

            if (item != null) {
                order.addItem(item);
            }
        }

        // Display the order summary
        System.out.println("Order Summary:");
        for (int i = 0; i < order.getItemCount(); i++) {
            System.out.println(order.getItems()[i].getItemName() + ": $" + order.getItems()[i].getItemPrice());
        }
        System.out.println("Total cost: $" + order.calculateTotal());
        System.out.println("Thank you for shopping at our bakery!");

        scanner.close();
    }
    
    
}
