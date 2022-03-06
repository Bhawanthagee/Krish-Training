import com.bhawantha.OperationsOfOccurrences;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ArrangeWordsTest {


    @Test
    public void arrangeWordsTest(){
        OperationsOfOccurrences operations = new OperationsOfOccurrences();

        String userInput = "Bhawantha";
        userInput = userInput.toLowerCase();
        List<Character> expected =new ArrayList<>();
        for(int i=0;i<userInput.length();i++){
            expected.add(userInput.charAt(i));
        }
        List<Character>actual=new ArrayList<>();
        actual = operations.arrangeWord(userInput);
        assertEquals(expected,actual);



    }
}
