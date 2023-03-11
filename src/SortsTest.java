import junit.framework.TestCase;
import org.junit.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortsTest extends TestCase {
    static Sorts so;
    long startTime;
    long endTime;
    static List<Integer> list,sortedList;

    static  {
        so = new Sorts();
        list =  new ArrayList<>();
        sortedList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src//list.csv"));
            BufferedReader br2 = new BufferedReader(new FileReader("src//sorted.csv"));
            String[] arr = br.readLine().split(",");
            for (String string:arr) {
                list.add(Integer.valueOf(string));
            }
            String[] arr2 = br2.readLine().split(",");
            for (String string:arr2) {
                sortedList.add(Integer.valueOf(string));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Before
    public void setUp() {
        startTime = System.nanoTime();
    }

    @Test
    public void testSelection() {
        List<Integer> re = so.selectionSort(list);
        Assert.assertEquals("jh",sortedList, re);
    }
    @Test
    public void testInsertion() {
        List<Integer> re = so.insertionSort(list);
        Assert.assertEquals("jh",sortedList, re);
    }
    @Test
    public void testBubble() {
        List<Integer> re = so.bubbleSort(list);
        Assert.assertEquals("jh",sortedList, re);
    }

    @After
    public void tearDown() {
        endTime = System.nanoTime();
        System.out.println("Time: " + (endTime - startTime)+" NanoS For:"+this.getName());
    }
}
