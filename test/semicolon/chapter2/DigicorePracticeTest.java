package semicolon.chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigicorePracticeTest {

    DigicorePractice dg = new DigicorePractice();
    @Test
    void testForPrimeNumber(){
        String say = dg.getPrimeNumber(120);
        assertEquals("2 3 5", say);
    }
}