import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest{

	@Test
	public void testThatACarCanDrive(){
		Car car = new Car();
		boolean isRunning = false;
		boolean actual = car.startCar(isRunning);
		boolean expected = true;
		assertTrue(actual, expected);
	


	}



}