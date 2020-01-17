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
            System.out.println("Would you like to do something else? yes or no");
            Scanner yes = new Scanner(System.in);
            String nextInp = yes.nextLine();
            if (nextInp.equals("yes") || nextInp.equals("y")){
                System.out.println("Please enter: \"x\" for (times), \"/\" for (divide), \"+\" for (add) or \"-\" for (subtract)");
                Scanner sign = new Scanner(System.in);
                String signInp = sign.nextLine();
                System.out.println("Please enter another Fraction: ");
                Scanner secondFraction = new Scanner(System.in);
                var userInput2 = secondFraction.nextLine();
                Fraction secondFrac = new FractionImpl(userInput2);
                if (signInp.equals("x")) {
                    Fraction total = firstFrac.multiply(secondFrac);
                    System.out.println(firstFrac.toString() + " " + signInp + " " + secondFrac.toString() + " = " + total.toString());
                    firstFrac = total;
                }
                if (signInp.equals("/")) {
                    Fraction total = firstFrac.divide(secondFrac);
                    System.out.println(firstFrac.toString() + " " + signInp + " " + secondFrac.toString() + " = " + total.toString());
                    firstFrac = total;
                }
                if (signInp.equals("+")) {
                    Fraction total = firstFrac.add(secondFrac);
                    System.out.println(firstFrac.toString() + " " + signInp + " " + secondFrac.toString() + " = " + total.toString());
                    firstFrac = total;
                }
                if (signInp.equals("-")) {
                    Fraction total = firstFrac.subtract(secondFrac);
                    System.out.println(firstFrac.toString() + " " + signInp + " " + secondFrac.toString() + " = " + total.toString());
                    firstFrac = total;
                }
            }
            else {
                System.out.println("Thank you for using this FractionProgram");
                done = false;
            }
        }
    }
}
