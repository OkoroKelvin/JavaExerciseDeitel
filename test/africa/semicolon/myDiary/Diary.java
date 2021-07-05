package africa.semicolon.myDiary;

import java.util.ArrayList;

public class Diary {

    private final String diaryTitle;
    private ArrayList<Entry> entries;

    public Diary(String diaryTitle) {
        this.diaryTitle = diaryTitle;
        entries = new ArrayList<>();
    }

    public String getTitle() {
        return this.diaryTitle;
    }

    public void addEntry(Entry entry) {
        entries.add(entry);

    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public void addEntry(String entryTitle, String entryBody) {
        Entry entry = new Entry();
        entry.setBody(entryBody);
        entry.setTitle(entryTitle);
        addEntry(entry);
    }

    public Entry findEntryByTitle(String title) {
        for (Entry entry : entries) {
            if (entry.getTitle().equals(title)) {
                return entry;
            }

        }
        return null;
    }

    public void deleteEntryByTitle(String title) {
        Entry foundEntry = findEntryByTitle(title);
        entries.remove(foundEntry);
    }
}

