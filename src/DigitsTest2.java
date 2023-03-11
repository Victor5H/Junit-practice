import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DigitsTest2 extends TestCase {
    String res1;
    String res1e;
//    @Override
//    protected void setUp() throws Exception {
//        System.out.println(this.countTestCases());
//        res1 = String.valueOf(Digits.sumOfDigits(123));
//        res1e = String.valueOf(6);
//
//    }
    @Test(timeout = 1)
    public void testSumofDig(){
        System.out.println(this.getName());
        assertEquals(res1e,res1);
    }
}
