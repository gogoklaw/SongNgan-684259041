import java.util.Scanner;

public class ShippingCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Shipping Cost Calculator ===");
        
        // 1. Input Destination
        System.out.print("Enter Destination (1: Bangkok & Vicinity, 2: Upcountry): ");
        int destChoice = scanner.nextInt();
        String destination = (destChoice == 1) ? "bangkok" : "upcountry";

        // 2. Input Weight
        System.out.print("Enter Weight (kg): ");
        double weight = scanner.nextDouble();

        // 3. Input Express Service
        System.out.print("Express Service? (y/n): ");
        boolean isExpress = scanner.next().equalsIgnoreCase("y");

        // 4. Input VIP Status
        System.out.print("VIP Member? (y/n): ");
        boolean isVip = scanner.next().equalsIgnoreCase("y");

        // Calculate
        double baseCost = getBaseCost(destination, weight);
        double expressFee = isExpress ? 30 : 0;
        double subtotal = baseCost + expressFee;
        double discount = isVip ? subtotal * 0.2 : 0;
        double total = subtotal - discount;

        // Print Summary Bill
        System.out.println("\n========================================");
        System.out.println("           SHIPPING SUMMARY BILL        ");
        System.out.println("========================================");
        System.out.printf(" Destination    : %s%n", destination.equalsIgnoreCase("bangkok") ? "BKK & Vicinity" : "Upcountry");
        System.out.printf(" Weight         : %.2f kg%n", weight);
        System.out.printf(" Base Shipping  : %10.2f Baht%n", baseCost);
        System.out.printf(" Express Fee    : + %8.2f Baht%n", expressFee);
        System.out.println("----------------------------------------");
        System.out.printf(" Subtotal       : %10.2f Baht%n", subtotal);
        if (isVip) {
            System.out.printf(" VIP Discount   : - %8.2f Baht (20%%)%n", discount);
        }
        System.out.println("----------------------------------------");
        System.out.printf(" TOTAL COST     : %10.2f Baht%n", total);
        System.out.println("========================================");

        scanner.close();
    }

    private static double getBaseCost(String destination, double weight) {
        if (destination.equalsIgnoreCase("bangkok")) {
            if (weight <= 1) return 40;
            if (weight <= 3) return 60;
            if (weight <= 5) return 80;
            return 100;
        } else {
            if (weight <= 1) return 60;
            if (weight <= 3) return 90;
            if (weight <= 5) return 120;
            return 150;
        }
    }
}
