package africa.semicolon.myDiary;

import java.time.LocalDateTime;

public class Entry {
    private LocalDateTime dateTime;
    private String entryTitle;
    private String body;

    public Entry(){
        dateTime = LocalDateTime.now();
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setTitle(String title) {
       entryTitle = title;

    }

    public String getTitle() {
        return entryTitle;
    }

    public void setBody(String body) {
        this.body = body;

    }

    @Override
    public String toString() {
        return "Entry{" +
                "dateTime=" + dateTime +
                ", entryTitle='" + entryTitle + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public String getBody() {
        return this.body;
    }
}
