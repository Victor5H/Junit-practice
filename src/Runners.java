import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runners {
    public static void main(String[] args) {
        Result rs = JUnitCore.runClasses(Suite.class);
        for (Failure failure:
                rs.getFailures()) {
            System.out.println(failure.getTrace());
        }
        System.out.println(rs.getRunCount());
        System.out.println(rs.wasSuccessful());
    }
}
