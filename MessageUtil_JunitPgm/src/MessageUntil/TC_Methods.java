package MessageUntil;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TC_Methods extends TestCase{
	protected double num1;
	protected double num2;
	
	@Before
	public void setUp() {
		num1 = 45.9;
		num2 = 20.2;
	}	

	@Test
	public void testAdd() {
		//counts the testCases
		System.out.println("No of Test Cases = s" + this.countTestCases());
		
		
		//test getName()
		String name = this.getName();
		System.out.println("Test Case Name = " + name);
		
		//test setName()
		this.setName("NewTestName");
		String newName = this.getName();
		System.out.println("Updated Test case Name = " +newName);
	}

	 //tearDown used to close the connection or clean up activities
	   public void tearDown() {
	   }
}
