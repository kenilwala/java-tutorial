import java.util.Scanner;

public class SnackMenu {
    public static void main(String[] args) {
        String[] snack_names = {"Chips", "Choclate","Soda","Burger", "Pepsi", "Cola"};
        int[] price = {20,30,45,55,7,90};
        Scanner in = new Scanner(System.in);

        int length = Math.min(snack_names.length, price.length);
        for(int i= 0;i<length;i++){
            System.out.println(i+1+". "+snack_names[i]+" = "+price[i]);
        }

        System.out.print("Enter the number of your choice: ");
        int userIn = in.nextInt();
        if(userIn<1 || userIn >length){
            System.out.println("Invalid selection.");
        }else{
            System.out.println("You selected: "+ snack_names[userIn-1]+"\nIt'll cost: "+price[userIn-1]);

            int totalInserted = 0;
            while(price[userIn-1]>=totalInserted) {
                System.out.print("Insert Coin: ");
                int coinInserted = in.nextInt();
                totalInserted +=coinInserted;
                System.out.println("Total inserted: "+totalInserted);
            }
            System.out.println("✅ "+snack_names[userIn-1]+" dispensed!");
            System.out.println("Balance returned: "+(totalInserted-price[userIn-1]));
        }

    }
}
