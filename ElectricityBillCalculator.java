import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณากรอกหน่วยการใช้ไฟฟ้า (kWh): ");
        double units = scanner.nextDouble();

        double bill = calculateBill(units);
        double serviceFee = 50.0;
        double totalBill = bill + serviceFee;

        System.out.println("-----------------------------------");
        System.out.printf("จำนวนหน่วยที่ใช้: %.2f หน่วย\n", units);
        System.out.printf("ค่าไฟฟ้าตามหน่วย: %.2f บาท\n", bill);
        System.out.printf("ค่าบริการคงที่: %.2f บาท\n", serviceFee);
        System.out.printf("รวมค่าไฟฟ้าทั้งสิ้น: %.2f บาท\n", totalBill);
        System.out.println("-----------------------------------");

        scanner.close();
    }

    public static double calculateBill(double units) {
        double bill = 0;

        if (units <= 150) {
            bill = units * 3.50;
        } else if (units <= 400) {
            bill = (150 * 3.50) + ((units - 150) * 4.20);
        } else {
            bill = (150 * 3.50) + (250 * 4.20) + ((units - 400) * 5.00);
        }

        return bill;
    }
}
