import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import org.junit.*;
import static java.lang.System.*;
class myChecker implements StringChecker {
  public boolean checkString(String s) {
    if(s.contains("blue")){
      return true;
  }
    return false;
  }
}
public class ListTests {
	@Test 
	public void testFilter() {
    List<String> list = Arrays.asList("blue", "blueberry", "bluest");
    List<String> answer = Arrays.asList("blue", "blueberry", "bluest"); 
    
     List<String> temp =ListExamples.filter(list, new myChecker()); 
     for(int i = 0; i<temp.size(); i++)
    {
       System.out.println(i + ": "+ temp.get(i));
    }
    System.out.println(temp.size());
    assertEquals(answer, ListExamples.filter(list, new myChecker()));
	}
  @Test 
	public void testMerge() {
    List<String> list = Arrays.asList("stocking", "jacket", "tongue");
    List<String> list2 = Arrays.asList("evergreen", "wintergreen", "greengrocers"); 
    List<String> merged = Arrays.asList("evergreen", "greengrocers", "jacket", "stocking", "tongue", "wintergreen"); 
 
     List<String> temp =ListExamples.filter(list, new myChecker()); 
     for(int i = 0; i<temp.size(); i++)
    {
       System.out.println(i + ": "+ temp.get(i));
    }
    System.out.println(temp.size());
    assertEquals(merged, ListExamples.merge(list, list2));
	}
}

