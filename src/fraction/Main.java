package fraction;

public class Main {

    public static void main(String[] args) {

        Fraction a = new FractionImpl(1,3);
        Fraction b = new FractionImpl(1,4);
        Fraction c = a.add(b);

        System.out.println(c.toString());
    }
}
