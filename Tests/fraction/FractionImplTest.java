package fraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FractionImplTest {
    Fraction third = new FractionImpl(1,3);
    Fraction quarter = new FractionImpl(1,4);
    Fraction half = new FractionImpl(1,2);
    Fraction bighalf = new FractionImpl(10,20);
    Fraction n_half = new FractionImpl(10,-20);

    @Test
    void exceptionTesting(){
        assertThrows(ArithmeticException.class, () -> new FractionImpl(10,0));
    }

    @Test
    void add() {
        Fraction total = third.add(quarter);
       assertEquals("7/12",total.toString());
    }

    @Test
    void subtract() {
        Fraction total = half.subtract(quarter);
        assertEquals("1/4",total.toString());
    }
    @Test
    void multiply() {
        Fraction total = half.multiply(half);
        assertEquals("1/4",total.toString());
    }

    @Test
    void divide() {
        Fraction total = quarter.divide(half);
        assertEquals("1/2",total.toString());
    }

    @Test
    void abs()  {
        Fraction total = n_half.abs();
        assertEquals("1/2",total.toString());
    }

    @Test
    void negate() {
        Fraction total = quarter.negate();
        assertEquals("-1/4",total.toString());
    }

    @Test
    void testEquals() {
        assertEquals(bighalf, half);
    }

    @Test
    void inverse(){
        Fraction total = quarter.inverse();
        assertEquals("4/1",total.toString());
    }

    @Test //testing to see less than
    void compareTo1() {
        assertEquals(-1,quarter.compareTo(half));
    }

    @Test //testing to see more than
    void compareTo2() {
        assertEquals(1,third.compareTo(quarter));
    }

    @Test //testing to see equal to
    void compareTo3() {
        assertEquals(0,bighalf.compareTo(half));
    }

    @Test
    void testToString() {
        assertEquals("1/2",half.toString());
    }
}