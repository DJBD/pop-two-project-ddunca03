package fraction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to your FractionProgram!");
        System.out.println("Please enter a Fraction (n/d): ");
        Scanner firstFraction = new Scanner(System.in);
        var userInput = firstFraction.nextLine();
        System.out.print("You have entered: ");
        Fraction firstFrac = new FractionImpl(userInput);
        System.out.println(firstFrac.toString());

        boolean done = true;
        while (done){
            System.out.println("Would you like to do something else?");
            Scanner yesorno = new Scanner(System.in);
            String nextInp = yesorno.nextLine();
            System.out.println(nextInp);
            if (nextInp == "yes"){
                System.out.println("Please enter: x / + or -");
            }
            else done = false;
        }




    }
}
