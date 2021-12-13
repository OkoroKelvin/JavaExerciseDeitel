package africa.semicolon.chapter16;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CollectionTest {
    @Test
    public void test(){
        Integer age = 16;
        int whatever;
        whatever = age;
    }
    @Test
    public void test_2(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        assertEquals(1,numbers.size());
        assertTrue(numbers.contains(45));
    }


}