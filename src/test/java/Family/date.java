package Family;

import java.security.Timestamp;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class date {

//    public static void main(String args[]) {
//
//        LocalTime localTime = LocalTime.now(); // 13:45:30.123450000
//        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("DD:MM:YYYY");
//        String timenow = localTime.format(fmt2);
//        System.out.println(timenow);
//
//    }
//}


    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd, MM, yyyy HH:mm:ss");
        System.out.println(dateTime.format(formatter));
    }
    }