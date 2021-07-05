package africa.semicolon.myDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EntryTest {
    @Test
    public void entryCanBeCreatedTest(){

        Entry entry = new Entry();
        assertNotNull(entry);
    }
    @Test
    public void entryHasDateAfterCreation(){
        Entry entry = new Entry();
        System.out.println(entry.getDateTime());
        assertNotNull(entry.getDateTime());
    }
    @Test
    public void entryHasATitleTest(){
        Entry entry = new Entry();
        entry.setTitle("My Break up Experience with Delly");
        assertEquals("My Break up Experience with Delly", entry.getTitle());
    }
    @Test
    public void entryHasABodyTest(){
        Entry entry = new Entry();
        String entryBody = """
                I dinor do anything oh, He just came and said he wanted to work on himself.
                """;
        entry.setBody(entryBody);
        assertEquals(entryBody, entry.getBody());
    }
}

