package semicolonTest.chapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import semicolon.chapter3.Date;


//import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTest {
    Date calender;

    @BeforeEach
    void setup() {
        calender = new Date(5, 22, 2021);

    }

    @Test
    public void testToSetAndGetMonthOfDate() {
        calender.setDateMonth(13);
        calender.getDateMonth();
        assertEquals(13, calender.getDateMonth());
    }

    @Test
    public void testToSetAndGetDayOfDate() {
        calender.setDateDay(22);
        assertEquals(22, calender.getDateDay());
    }

    @Test
    public void testToSetAndGetYear() {
        calender.setYearOfDate(2019);
        assertEquals(2019, calender.getYearOfDate());
    }

    @Test
    public void testToDisplayDate() {
        calender.displayDate();
        assertEquals("5/22/2021", calender.displayDate());
    }
}


