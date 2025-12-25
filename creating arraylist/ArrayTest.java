import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest{
	@Test
	public void testThatArrayLengthFunctionExist(){
		ArrayFunctions array = new ArrayFunctions();
		Object actual = array.size() ;
		assertEquals(actual, 1);
	}

}