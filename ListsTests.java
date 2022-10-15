import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListsTests {
    @Test
    public void testFilter(){
        List<String> input = new ArrayList<>(Arrays.asList("banana", "apple", "egg", "mango"));
        List<String> output  = new ArrayList<>(Arrays.asList("banana", "apple","mango"));
        StringChecker sc = new StringChecker(){
            public boolean checkString(String s) {
                boolean ans = false;
                for(int i = 0; i < s.length(); i++){
                  if(s.charAt(i) == 'a' || s.charAt(i) == 'A' ){
                    return ans = true;
                  }
                }
                return ans;
              }
        };
        assertEquals(output, ListExamples.filter(input, sc));
    }

    @Test
    public void testMerge(){
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        List<String> list2 = new ArrayList<>(Arrays.asList("e", "f", "g"));
        List<String> output = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f","g"));
        assertEquals(output, ListExamples.merge(list1, list2));
    }

}
