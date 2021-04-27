package MessageUntil;
import org.junit.Test;
import static org.junit.Assert.*;


public class AssertFunctions_Use {

	@Test 
	public void testAdd() {
		int num = 10;
		String temp = null;
		String str = "Hands-on on Assert Functions";
		
		String str1 = "Heaven";
		String str2 = null;
		String str3 = "Earth";
		String str4 = new String("Heaven");
		
		int a = 45;
		int b = 30;
		
		String[] expectedArray = {"one","two","three"};
		String[] resultArray = {"one","two","three"};
		
		//check for equality 
		assertEquals("Hands-on on Assert Functions", str);
		
		//check for false condition
		assertFalse(num > 11);
		
		//check for NOT NULL Value
		//assertNotNull(temp)
		
			
			assertEquals(str1, str4);
			assertTrue(a > b);
			assertFalse(a < b);
			assertNotNull(str1);
			assertNull(str2);
			assertNotSame(str3,str4);
			assertArrayEquals(expectedArray,resultArray);
		}
	}

