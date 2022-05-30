package Family;

import java.security.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class date {

    public static void main(String args[]) {

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate localDate = LocalDate.now();
//            driver.findElement(fromDate).sendKeys(dtf.format(localDate));
        System.out.println(localDate);
        }



    }

