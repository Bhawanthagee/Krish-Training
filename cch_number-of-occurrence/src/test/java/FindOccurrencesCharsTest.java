import com.bhawantha.OperationsOfOccurrences;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FindOccurrencesCharsTest {
    @Test
    public void findOccurrencesChars(){
        //List<Character>userInput = new ArrayList<>();
        OperationsOfOccurrences operations = new OperationsOfOccurrences();

        String userInputString = "Bhawantha";
        userInputString = userInputString.toLowerCase();
        List<Character> userInput =new ArrayList<>();
        for(int i=0;i<userInputString.length();i++){
            userInput.add(userInputString.charAt(i));
        }

        HashMap<Character,Integer>expected = new HashMap<>();
        expected.put('b',1);
        expected.put('a',3);
        expected.put('w',1);
        expected.put('n',1);
        expected.put('t',1);
        expected.put('h',2);

        HashMap<Character,Integer>actual = new HashMap<>();

        actual = operations.findOccurrencesChars(userInput);
        assertEquals(expected,actual);
    }
}
