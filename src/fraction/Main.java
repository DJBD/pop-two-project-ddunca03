package fraction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to your FractionProgram!" + "\n" + "You can use the following features: add, subtract, multiply, divide, absolute, inverse, equal to, compare to");

        Scanner firstFraction = new Scanner(System.in);
        var userInput = firstFraction.nextLine();

        Fraction firstFrac = new FractionImpl(userInput);
        System.out.println(firstFrac.toString());




    }
}
