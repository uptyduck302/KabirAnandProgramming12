import com.anand.testexamples.BigInt;
import org.junit.Test;
import java.math.BigInteger;
import static org.junit.Assert.assertEquals;

public class BigIntTest {

    // Partition
    /*
    a and b are positive
    a and b are negative
    a is positive and b is negative
    a is negative and b is positive
    Boundary Cases
    a or b = 1, 0, -1
     */

    /**
     * Partitioned the inputs as follows:
     * a and b -> positive
     * a -> positive b -> negative
     * a and b -> negative
     *
     * a = 0, b positive
     * a = 1, b positive
     */

    @Test
    public void testabpositive() {
        // 34 * 56
        BigInteger a = new BigInteger("34");
        BigInteger b = new BigInteger("56");
        BigInteger expected = new BigInteger("1904");
        assertEquals(expected, BigInt.multiply(a, b));

        // 34 * 34
        a = new BigInteger("34");
        b = new BigInteger("34");
        expected = new BigInteger("1156");
        assertEquals(expected, BigInt.multiply(a, b));

        // 65 * 42
        a = new BigInteger("65");
        b = new BigInteger("42");
        expected = new BigInteger("2730");
        assertEquals(expected, BigInt.multiply(a, b));
    }

    @Test
    public void testboundaries() {
        // 0 * 4353
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("4353");
        BigInteger expected = new BigInteger("0");
        assertEquals(expected, BigInt.multiply(a, b));

        // 1 * 2424
        a = new BigInteger("1");
        b = new BigInteger("2424");
        expected = new BigInteger("2424");
        assertEquals(expected, BigInt.multiply(a, b));

        // 32424 * -1
        a = new BigInteger("32424");
        b = new BigInteger("-1");
        expected = new BigInteger("-32424");
        assertEquals(expected, BigInt.multiply(a, b));
    }
}
