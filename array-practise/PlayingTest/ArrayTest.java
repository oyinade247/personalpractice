import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest{

	@Test
	public void testThatArrayCanBeSorted(){
		Array array = new Array();
		
		int [] numbers = {2,3,5,7,1};

		int [] actual = array.sortedArray(numbers);
		int [] expected = {1,2,3,5,7};
		assertArrayEquals(actual,expected);
	}


	@Test
	public void testThatArrayHasALength(){
		Array array = new Array();
		
		int [] numbers = {2,3,5,7,1};
		int actual = array.lengthArray(numbers);
		int  expected = 5;
		assertEquals(actual,expected);

		

	}


	@Test
	public void testThatArrayCanBeCombined(){
		Array array = new Array();

		int [] first = {1,2,3,4};
		int [] second = {5,6};
		int [] third = {7,8};
		int actual = array.countCombinedArray(first,second,third);
		int  expected = 9;
		assertEquals(actual,expected);

		
	}


	@Test

	public void testThatYouCanCombinedArrayInANewArray(){
		Array array = new Array();
		int [] first = {1,2,3,4};
		int [] second = {5,6};
		int [] third = {7,8};
		int []actual = array.combinedArray(first,second,third);
		int [] expected ={1,2,3,4,5,6,7,8};
		assertEquals(actual,expected);

		

	}









}