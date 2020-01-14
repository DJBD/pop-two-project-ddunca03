package fraction;

public class Main {

    public static void main(String[] args) {

        Fraction a = new FractionImpl(1,3);
        Fraction b = new FractionImpl(1,0);
        Fraction c = a.add(b);

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));

       // System.out.println(a.equals(b));

       // System.out.println(c.toString());
    }
}
