package MessageUntil;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssertFunctions_Use {

	@Test 
	public void testAdd() {
		int num = 10;
		String temp = null;
		String str = "Hands-on on Assert Functions";
		
		//check for equality 
		assertEquals("Hands-on on Assert Functions", str);
		
		//check for false condition
		assertFalse(num > 11);
		
		//check for NOT NULL Value
		//assertNotNull(temp);

		
	}
}
