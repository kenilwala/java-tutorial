import java.util.Scanner;

public class PracticeSet1 {
    public static void main(String[] args) {
        //Program to Sum 3 Numbers in Java
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        for(int i=1; i<=3; i++){
            System.out.print("Enter "+i+" Number :");
            float no = sc.nextFloat();
            sum+=no;}
        System.out.println("the sum of the 3 number is: "+sum);

        //Program to Calculate CGPA using marks of three subjects (out of 100)
        int number_of_subjects=3;
        Scanner s = new Scanner(System.in);
        float total = 0;
        //To Call subjects while asking for marks in for loop
        String[] a = {"maths", "physics", "bio", "chem","acounting"};

        for (int i=0;i<=number_of_subjects-1;i++){
            System.out.println("Enter Your Marks for "+a[i]+" subject"); //a[i] calls subject while asking for marks
            float in= s.nextInt(); //takes marks as input
            if (in<=100) //checks for valid marks
                total +=in; //increments the total of the entered marks
            else{
                System.out.println("Invalid Input, Try Using Valid Inputs");
                return;} //returns to end as a invalid value is entered
        }
        float percent = total/number_of_subjects; //since the max marks is 100 the average marks can be the percentage
        System.out.println("You Have Got "+percent+"%");
        if(percent>=90){
            System.out.println("You Have Passed With Distinction, Congratulations!");
        }
        else if(percent>=70){
            System.out.println("Goodjob, You Can be The Next Try for Higher!");
        }
        else if (percent>=50) {
            System.out.println("You can do Better!");
        }
        else
            System.out.println("Better luck next Time!");

        //Program which asks the User to enter his/her name and Greets them with  "Hello <name>, have a good day" Text
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = in.next();
        System.out.printf("Hello %s, Have a Nice Day!",name);

        //Program to Create Kilometer into Miles
        System.out.println("Enter distance in Kilometer: ");
        float kilo= in.nextFloat();
        System.out.println("Distance in Miles is: "+ 0.621371f*kilo);

        //Program to detect whether a number entered by the user is integer or not
        System.out.print("Enter a  Number to check for Integer: ");
        Scanner we = new Scanner(System.in);
        if(we.hasNextInt()==true)
            System.out.println("It is a integer");
        else
            System.out.println("It is not a integer");
    }
}
