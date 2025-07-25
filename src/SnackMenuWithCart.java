import java.util.Scanner;

public class SnackMenuWithCart {
    public static void main(String[] args) {
        String[] snack_names = {"Chips", "Choclate", "Soda", "Burger", "Pepsi", "Cola" };
        int[] price = {20, 30, 45, 55, 7, 90};
        Scanner in = new Scanner(System.in);

        int length = Math.min(snack_names.length, price.length);
        for (int i = 0; i < length; i++) {
            System.out.println(i + 1 + ". " + snack_names[i] + " = " + price[i]);
        }

        int[] cart = new int[100];
        int cartSize = 0;
        int totalCost = 0;

        while (true) {
            System.out.print("Select snack number or 0 to finish: ");
            int userIn = in.nextInt();

            if (userIn == 0) break;

            if (userIn >= 1 && userIn <= length) {
                cart[cartSize++] = userIn - 1;
                totalCost += price[userIn - 1];
                System.out.println(snack_names[userIn - 1] + " added to Cart.");
            } else {
                System.out.println("Invalid snack number.");
            }
        }

        System.out.println("\nYour Cart:");
        for(int i = 0;i<cartSize;i++){
            int index = cart[i];
            System.out.println("- "+snack_names[index]+" = Rs."+price[index]);
        }

        System.out.println("Total Cost: Rs."+totalCost);


    }
}
