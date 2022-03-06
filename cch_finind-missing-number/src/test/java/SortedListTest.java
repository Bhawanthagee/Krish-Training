import com.example.Operation;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class SortedListTest {
   @Test
    public void sortedListTest(){
       Operation operation = new Operation();


       List<Integer> userInput = new ArrayList<>();
       userInput.add(8);
       userInput.add(1);
       userInput.add(7);
       userInput.add(3);
       userInput.add(6);
       userInput.add(5);

       int[]expectedSortedList = new int[userInput.size()];
       expectedSortedList[0]=1;
       expectedSortedList[1]=3;
       expectedSortedList[2]=5;
       expectedSortedList[3]=6;
       expectedSortedList[4]=7;
       expectedSortedList[5]=8;



       int[]actual = new int[userInput.size()];

       actual   = operation.sortList(userInput);
       assertEquals(Arrays.toString(expectedSortedList),Arrays.toString(actual));


   }
}
