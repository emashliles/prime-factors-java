import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    @Test
    public void calculates2() {
        assertEquals(true, PrimeFactors.calculate(2).contains(2));
    }

    @Test
    public void calculates3() {
        assertEquals(true, PrimeFactors.calculate(3).contains(3));
    }

    @Test
    public void calculates4() {
        assertEquals(2, PrimeFactors.calculate(4).size());
    }
}
