package Java_Examples;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTime_and_DateTimeFormatter {
	public static void main(String[] args) {
        /*/Approach 1
		// Get current date and time
        LocalDateTime now = LocalDateTime.now();

        // Define a formatter for date and time
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Print date and time separately
        System.out.println("Current Date: " + now.format(dateFormatter));
        System.out.println("Current Time: " + now.format(timeFormatter));
        System.out.println("Complete Timestamp: " + now); //*/
		
		
		//Approach 2
		//to get Date stamping with file
		Date date = new Date();	//it will return system date
		SimpleDateFormat dateAndTimestampFormatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		String df1= dateAndTimestampFormatter.format(date); //to convert into required format
		System.out.println(df1); //*/
    }
}
