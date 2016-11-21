import sun.util.calendar.BaseCalendar;

import javax.xml.crypto.Data;

public class Lesson {
    String name;
    BaseCalendar.Date date;
    Lesson(BaseCalendar.Date d, String  n){
        name=n;
        date=d;
    }
}
