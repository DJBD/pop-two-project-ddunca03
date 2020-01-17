package fraction;

public class FractionImpl implements Fraction {
    private int numerator;
    private int denominator;

    /**
     * Parameters are the <em>numerator</em> and the <em>denominator</em>.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are <pre>(8, -12)</pre>, create a <pre>Fraction</pre> with numerator
     * <pre>-2</pre> and denominator <pre>3</pre>.
     *
     * The constructor should throw an <pre>ArithmeticException</pre> if the denominator is zero.
     *
     * @param numerator
     * @param denominator
     */
    public FractionImpl(int numerator, int denominator) {

        if (denominator == 0) {throw new ArithmeticException("Divide by zero");}
        //making sure you cannot divide by zero and throws an exception if so

        int n1 = java.lang.Math.abs(numerator), n2 = java.lang.Math.abs(denominator), gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i) //calculating the greatest common denominator
        {
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }
        this.numerator = numerator/gcd;
        this.denominator = denominator/gcd;
        //simplifies the fraction

        if(denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;

            //ensures that only the numerator can be negative
        }
    }
    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        this.numerator = wholeNumber;
        this.denominator = 1; //set the denominator to 1 as any whole number is a fraction over 1
    }

    /**
     * The parameter is a <pre>String</pre> containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an <pre>ArithmeticException</pre>
     * if given a string representing a fraction whose denominator is zero.
     * <p>
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * @param fraction the string representation of the fraction
     */
    public FractionImpl(String fraction) {

       String[] s_fraction = fraction.split("/");

       if (s_fraction.length == 1)
       {this.numerator = Integer.parseInt(s_fraction[0]);
        this.denominator = 1;}
       else{
       int numerator = Integer.parseInt(s_fraction[0]);
       int denominator = Integer.parseInt(s_fraction[1]);}

        if (denominator == 0) {throw new ArithmeticException("Divide by zero");}

        int n1 = java.lang.Math.abs(numerator), n2 = java.lang.Math.abs(denominator), gcd = 1;

        for(int i = 1; i <= n1 && i <= n2; ++i) //calculating the greatest common denominator
        {
            if(n1 % i==0 && n2 % i==0)
                gcd = i;
        }
        this.numerator = numerator/gcd;
        this.denominator = denominator/gcd;

        //simplifies the fraction

        if(denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;

            //ensures that only the numerator can be negative
        }
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction add(Fraction f) {
        FractionImpl cfrac = (FractionImpl) f; //casting f to the FractionImpl
        //f fraction c & d
        int c = cfrac.numerator;
        int d = cfrac.denominator;
        //this fraction a & b
        int a = this.numerator;
        int b = this.denominator;

        int ad = a * d;
        int bc = b * c;
        int bd = b * d;

        return new FractionImpl(ad+bc, bd); //sum calculation of two fractions

    }
    /**
     * @inheritDoc
     */
    @Override
    public Fraction subtract(Fraction f) {
        FractionImpl cfrac = (FractionImpl) f; //casting f to the FractionImpl
        //f fraction c & d
        int c = cfrac.numerator;
        int d = cfrac.denominator;
        //this fraction a & b
        int a = this.numerator;
        int b = this.denominator;

        int ad = a * d;
        int bc = b * c;
        int bd = b * d;

        return new FractionImpl(ad-bc, bd); //subtraction calculation of two fractions

    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction multiply(Fraction f) {
        FractionImpl cfrac = (FractionImpl) f; //casting f to the FractionImpl
        //f fraction c & d
        int c = cfrac.numerator;
        int d = cfrac.denominator;
        //this fraction a & b
        int a = this.numerator;
        int b = this.denominator;

        return new FractionImpl(a*c, b*d); // multiplication calculation
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction divide(Fraction f) {
        FractionImpl cfrac = (FractionImpl) f; //casting f to the FractionImpl
        //f fraction c & d
        int c = cfrac.numerator;
        int d = cfrac.denominator;
        //this fraction a & b
        int a = this.numerator;
        int b = this.denominator;

        return new FractionImpl(a*d, b*c); // division calculation
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction abs() {
        if (this.numerator < 0)this.numerator=-this.numerator;
        return new FractionImpl(this.numerator, this.denominator); //ensure that all returned fractions are positive
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction negate() {
        this.numerator=-this.numerator;
        return new FractionImpl(this.numerator, this.denominator); //returns the opposite sign +/- of the fraction
    }

    /**
     * @inheritDoc
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * @inheritDoc
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof FractionImpl)) return false; //first this checks to see if each class is equal. If they aren't the same class then it is already false
        FractionImpl objFrac = (FractionImpl) obj; //cast the obj to the fractionImpl class
        return this.numerator == objFrac.numerator && this.denominator == objFrac.denominator; //boolean logic to show if the fraction is the same numbers
    }

    /**
     * @inheritDoc
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @inheritDoc
     */
    @Override
    public Fraction inverse() { //swaps the denominator and numerator
        int newtop = this.denominator;
        int newbot = this.numerator;
        return new FractionImpl(newtop,newbot);
    }

    /**
     * @inheritDoc
     */
    @Override
    public int compareTo(Fraction o) {
        Fraction sub = this.subtract(o);
        return Integer.compare(((FractionImpl) sub).numerator, 0);
    }

    /**
     * @inheritDoc
     */
    @Override
    public String toString() {
        int n = this.numerator;
        int d = this.denominator;
        return (n + "/" + d); //returns the fraction in as a String

    }
}