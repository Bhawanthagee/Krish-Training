import com.example.Operation;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class MissingValueTest {
    @Test
    public void missingValueTest(){

        Operation operation = new Operation();

        int[]userInput = new int[6];
        userInput[0] = 1;
        userInput[1] = 2;
        userInput[2] = 3;
        userInput[3] = 5;
        userInput[4] = 6;
        userInput[5] = 7;

        List<Integer>expected = new ArrayList<>();
        expected.add(4);
        List<Integer>actual = new ArrayList<>();

        actual = operation.missingValue(userInput);
        assertEquals(expected,actual);


    }
}
