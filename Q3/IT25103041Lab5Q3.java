import java.util.Scanner;

public class IT25103041Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_3_TO_4_DAYS = 10;
        final double DISCOUNT_5_OR_MORE_DAYS = 20;

        System.out.print("Enter start date (day): ");
        int startDate = input.nextInt();

        System.out.print("Enter end date (day): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        int days = endDate - startDate;

        double total = days * ROOM_CHARGE;
        double discountRate = 0;

        if (days >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        } else if (days >= 3) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        }

        double discount = total * discountRate / 100;
        double amountToPay = total - discount;

        System.out.println("Number of days reserved: " + days);
        System.out.println("Total room charges: Rs. " + total);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Discount amount: Rs. " + discount);
        System.out.println("Amount to pay: Rs. " + amountToPay);

       
    }
}