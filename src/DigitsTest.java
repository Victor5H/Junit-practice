import junit.framework.TestCase;
import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DigitsTest extends TestCase {
    long starttime;
    long endTime;
    static Digits dig;

    static {
        dig = new Digits();
    }

    public void setUp() {
        starttime = System.nanoTime();
    }

    @Test(timeout = 1)
    public void testFactorial() {
        assertEquals("6227020800", String.valueOf(dig.factorial(13)));
    }

    @Test
    public void testPrime() {
        assertTrue(dig.isPrime(5));
    }

    @Test
    public void testNumOfDigits() {
        assertEquals(10L, dig.numberOfDigits(1234567890));
    }

    @Test
    public void testSumOfDigits() {
        assertEquals(10, dig.sumOfDigits(91L));
    }

    @Test
    public void testHCF() {
        assertEquals(6, dig.HCF(12, 12));
    }
    @Test(timeout = (1/1000000))
    public void testDecToBin(){
        int [] n = {0, 0, 0, 1, 0, 1, 1, 1, 1, 1};
        assertEquals(Arrays.toString(n),Arrays.toString(dig.DecToBin(1000)));
    }
    @Test
    public void testIsComposite(){
        assertTrue(dig.isComposite(64));
    }
    @Test
    public void testOdd(){
        assertTrue(dig.isOdd(5));
    }
    @Test
    public void testEven(){
        assertTrue(dig.isEven(8));
    }
    @Test
    public void testArmstrong(){
        assertTrue(dig.isArmstrong(1634));
    }
    @Test
    public void testSumofDigUnit(){
        assertEquals(9,dig.sumOfDigitsUnit(45));
    }
    @Test
    public void testPerfectNum(){
        assertTrue("not a ",dig.isPerfectNum(36));
    }


    @Override
    @After
    protected void tearDown() throws Exception {
        endTime = System.nanoTime();
        System.out.println("Time: " + (endTime - starttime) + " Nano for:" + this.getName());
    }
}
