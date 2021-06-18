package semicolonTest.chapter5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.chapter5.PrimeFactorsOfNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorsOfNumberTest {
    PrimeFactorsOfNumber primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactorsOfNumber();
    }
    @Test

    void CheckIfPrimeFactorOfANumberCanBeKnown(){
        assertEquals("2,2,2,3,5", primeFactor.findPrimeFactor(120));
    }

}