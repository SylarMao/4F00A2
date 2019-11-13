import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class trigTest {

    @Test
    void sin()
    {
        trig a = new trig();
        double degree=90;
        assertEquals(1,a.sin(degree),1E-15);
    }

    @Test
    void cos()
    {
        trig a = new trig();
        double degree=90;
        assertEquals(0,a.cos(degree),1E-15);
    }

    @Test
    void tan() throws invalidInputException
    {
        trig a = new trig();
        double degree = 90;
        assertEquals(0,a.tan(degree),1E-15);
    }

    @Test
    void arcsin() throws invalidInputException
    {
        trig a = new trig();
        double degree = 0.5;
        assertEquals(30,a.arcsin(degree),0.001);
    }

    @Test
    void arccos() throws invalidInputException
    {
        trig a = new trig();
        double degree = 0.5;
        assertEquals(1.04720,a.arccos(degree),0.001);
    }

    @Test
    void arctan()
    {
        trig a = new trig();
        double degree = -12;
        assertEquals(-1.48765509,a.arctan(degree),0.001);

    }

    @Test
    void sec() throws invalidInputException
    {
        trig a = new trig();
        double degree = -12;
        assertEquals(-1.48765509,a.sec(degree),0.001);

    }

    @Test
    void csc() throws invalidInputException
    {
        trig a = new trig();
        double degree = -12;
        assertEquals(-1.48765509,a.csc(degree),0.001);

    }

    @Test
    void cot() throws   invalidInputException
    {
        trig a = new trig();
        double degree = -12;
        assertEquals(-1.48765509,a.cot(degree),0.001);

    }

    @Test
    void abs()
    {
        trig a = new trig();
        int i = -5;
        assertEquals(-i,a.abs(i),0);
    }

    @Test
    void factorial()
    {
        trig a = new trig();
        double i = a.factorial(5);
        assertEquals(5 * 4 * 3 * 2,i,0);
    }



    @Test
    void pow()
    {
        trig a = new trig();
        double i = a.pow(5,5);
        assertEquals(5*5*5*5*5,i,0);
    }
}