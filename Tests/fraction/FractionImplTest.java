package fraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionImplTest {
    Fraction third = new FractionImpl(1,3);
    Fraction quarter = new FractionImpl(1,4);
    Fraction half = new FractionImpl(1,2);
    Fraction n_half = new FractionImpl(10,-20);

    @Test
    void add() throws Exception{
        Fraction total = third.add(quarter);
       assertEquals("7/12",total.toString());
    }

    @Test
    void subtract() throws Exception{
        Fraction total = half.subtract(quarter);
        assertEquals("1/4",total.toString());
    }
    @Test
    void multiply() throws Exception{
        Fraction total = half.multiply(half);
        assertEquals("1/4",total.toString());
    }

    @Test
    void divide() throws Exception{
        Fraction total = quarter.divide(half);
        assertEquals("1/2",total.toString());
    }

    @Test
    void abs() throws Exception{
        Fraction total = n_half.abs();
        assertEquals("1/2",total.toString());
    }

    @Test
    void negate() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void inverse() {
    }

    @Test
    void compareTo() {
    }

    @Test
    void testToString() {
    }
}