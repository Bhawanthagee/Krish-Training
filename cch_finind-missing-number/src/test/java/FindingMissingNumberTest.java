import com.example.Operation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FindingMissingNumberTest {
    @Test
    public void putInToListTest(){

        Operation operation = new Operation();

        final String userInput ="8,1,7,3,6,5";
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(8);
        expectedList.add(1);
        expectedList.add(7);
        expectedList.add(3);
        expectedList.add(6);
        expectedList.add(5);
        List<Integer> actual = new ArrayList<>();

        actual = operation.putinToArrayList(userInput);

        assertEquals(expectedList,actual);




    }
}
