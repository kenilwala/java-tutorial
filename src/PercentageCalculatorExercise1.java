import java.util.Scanner;
public class PercentageCalculatorExercise1 {
    public static void main(String[] args) {
        int number_of_subjects=5;
        Scanner s = new Scanner(System.in);
        float total = 0;
        //To Call subjects while asking for marks in for loop
        String[] a = {"maths", "physics", "bio", "chem","acounting"};

        for (int i=0;i<=4;i++){
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
    }
}
