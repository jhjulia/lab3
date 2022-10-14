import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace_2(){
    int[] input1 = {0, 3, 5, 7, 11, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 11, 7, 5, 3, 0}, input1);
  }

  @Test
  public void testReversed_2(){
    int[] input1 = {1, 2, 3, 4, 5, 6};
    assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverage(){
    double[] input1 = {6, 4, 2, 8, 4};
    assertEquals(11, ArrayExamples.averageWithoutLowest(input1));
  }
}



