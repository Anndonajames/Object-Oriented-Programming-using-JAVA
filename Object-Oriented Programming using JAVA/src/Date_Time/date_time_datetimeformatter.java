package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_datetimeformatter {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		LocalDateTime date=LocalDateTime.now();
		System.out.println("Before formatting :"+date);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("E ,MM/YYYY  HH:mm:ss");
		String formatDate=date.format(format);
		System.out.println("Before formatting :"+formatDate);
}

}
