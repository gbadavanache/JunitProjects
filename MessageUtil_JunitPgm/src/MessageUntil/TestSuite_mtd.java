package MessageUntil;
import junit.framework.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestSuite_mtd {

	
	  public static void main(String[] a) {
	      // add the test's in the suite
	      TestSuite suite = new TestSuite(TestSuite_mtd.class,TestSuite_mtd.class, TestSuite_mtd.class );
	      TestResult result = new TestResult();
	      suite.run(result);
	      System.out.println("Number of test cases = " + result.runCount());

	  }
}
