package chapter15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TransactionRecordTest {
    @Test
    void testThatCreateTransactRecordConstructor(){
        TransactionRecord transactionRecord = new TransactionRecord(100,2500000);
        assertNotNull(transactionRecord);
    }
}