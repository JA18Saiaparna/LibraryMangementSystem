package testing;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.After;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import calci.Calculator;

class CalculatorTest {
  @BeforeAll
  public static void beforeAll()
  {
	  System.out.println("WElcome to testing");
  }
 
	@Test
	@DisplayName("sub")
	void testAdd() {
		Calculator cal = new Calculator();
		
		int actual = cal.add(5,4);	
		
		assertEquals(9, actual);
	}

	@Test
	void testSub() {
     Calculator cal = new Calculator();
		
		int actual = cal.sub(5,5);	
		
		assertEquals(0, actual);
		
		assertNotEquals(1, actual);
	}
	

}
