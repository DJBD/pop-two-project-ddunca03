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
    void abs()  throws Exception {
        Fraction total = n_half.abs();
        assertEquals("1/2",total.toString());
    }

    @Test
    void negate() throws Exception{
        Fraction total = quarter.negate();
        assertEquals("-1/4",total.toString());
    }

    @Test
    void testEquals() throws Exception{
        assertEquals(bighalf, half);
    }

    @Test
    void inverse() throws Exception{
        Fraction total = quarter.inverse();
        assertEquals("4/1",total.toString());
    }

    @Test //testing to see less than
    void compareTo1() throws Exception{
        assertEquals(-1,quarter.compareTo(half));
    }

    @Test //testing to see more than
    void compareTo2() throws Exception{
        assertEquals(1,third.compareTo(quarter));
    }

    @Test //testing to see equal to
    void compareTo3() throws Exception{
        assertEquals(0,bighalf.compareTo(half));
    }

    @Test
    void testToString() throws Exception {
        assertEquals("1/2",half.toString());
    }
}