import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import converter.ConverterMethods;


public class ConverterMethodsTest {
	
	ConverterMethods converter;
	
	@Before
	public void setUp() {
		
		// arrange
		converter = new ConverterMethods();
	}
	
	@Test
	public void kilograms2PoundsTest() {
		       //acting
				int result=(int) (converter.kilograms2Pounds(2));
				//assertion
				assertEquals(4, result);
	}

}
