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