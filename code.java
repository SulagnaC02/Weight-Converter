import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        //Declare variables
        //welcome message
        // prompt for user choice
        //option 1: to convert lbs to kg
        // option 2: to convert kg to lbs
        // else print invalid choice

        Scanner sc = new Scanner(System.in);
        double weight;
        double newW;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kg");
        System.out.println("2: Convert kg to lbs");

        System.out.print("Choose an option: ");
        choice = sc.nextInt();

        if (choice == 1)
        {
            System.out.print("Enter the weight in lbs: ");
            weight = sc.nextDouble();
            newW = weight * 0.453592;
            System.out.println("The new weight in kg is " + newW);
        }
        else if (choice == 2){
            System.out.print("Enter the weight in kgs:");
            weight = sc.nextDouble();
            newW = weight * 2.20462;
            System.out.print("The new weight in lbs: " + newW);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
