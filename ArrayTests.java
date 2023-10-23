import static org.junit.Assert.*;
import org.junit.*;
import static java.lang.System.*;
public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  @Test 
	public void testReverseInPlace_twoElement() {
    int[] input1 = { 2, 3, 5, 6,7 };
    ArrayExamples.reverseInPlace(input1);
    
    for(int i = 0; i<input1.length; i++)
    {
       System.out.println(i + ": "+ input1[i]);
    }
     assertArrayEquals(new int[]{7, 6, 5, 3, 2}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed_nonEmpty() {
    int[] input1 = {15, 16, 17};
    assertArrayEquals(new int[]{17, 16, 15}, ArrayExamples.reversed(input1));
  }
}

