package africa.semicolon.myDiary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    @Test
    public void diaryCanBeCreated(){
        Diary diary = new Diary("LOVE Stories");
        assertNotNull(diary);
        assertEquals("LOVE Stories", diary.getTitle());
    }
    @Test
    public void diaryCanAddEntryTest(){
        Diary diary = new Diary("Confidence Diary");
        Entry entry = new Entry();
        entry.setTitle("Ordinary Cake");
        entry.setBody("Because of ordinary cake...");

        diary.addEntry(entry);
        assertEquals(1, diary.getNumberOfEntries());

        diary.addEntry(entry);
        assertEquals(2, diary.getNumberOfEntries());

    }
    @Test
    public void diaryCanAddEntries(){
        Diary diary = new Diary ( "Blesssing Diary");
        diary.addEntry("The Love","Go placidly amidst the odd");
        assertEquals(1, diary.getNumberOfEntries());

    }
    @Test

    public void entriesCanBeSearchedByTitle(){
        Diary diary = new Diary ( "Blessing Diary");
        Entry entry = new Entry();
        entry.setTitle("Heart Torn Apart");
        entry.setBody("Because of ordinary cake");

        diary.addEntry(entry);
        diary.addEntry("The Love","Turn to page 2");

        Entry foundEntry = diary.findEntryByTitle("Heart Torn Apart");
        assertEquals(foundEntry, entry);
    }
    @Test
    public void diaryCanBeDeletedByTitle(){
        Diary diary = new Diary ( "Blessing Diary");
        Entry entry = new Entry();
        entry.setTitle("Ordinary Cake");
        entry.setBody("Because of ordinary cake...");

        diary.addEntry(entry);
        diary.addEntry("The Love","Go placidly amidst the odd");

        diary.deleteEntryByTitle("The Love");
        assertEquals(1, diary.getNumberOfEntries());
    }
}
