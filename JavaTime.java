import java.time.*; 			//	LocalDateTime, LocalTime, LocalDate
import java.time.format.*;		//	FormatStyle(enum), DateTimeFormatter

class JavaTime {

	public static void main(String... sth) {
		System.out.println(LocalDateTime.now() + "\n" + LocalTime.now() + '\n' + LocalDate.now());

		// convert from LocalDateTime instance
		var ldt = LocalDateTime.now();
		LocalDate ld = ldt.toLocalDate();
		LocalTime lt = ldt.toLocalTime();

		System.out.println("Date: " + ld + "\nTime: " + lt);


		// format date and time
		var time = LocalTime.now();
		String timeFormatted = time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
		String dateFormatted = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT));

		System.out.println(timeFormatted + '\n' + dateFormatted);


		//ISO_DATE and ISO_TIME
		//var iso = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(DateTimeFormatter.ISO_DATE, DateTimeFormatter.ISO_TIME));
		//System.out.println(iso);

		//	custom format: 	static DateTimeFormatter ofPattern(String p)
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy'-'dd'-'M HH':'MM':'s")));


		//	obtaining various date and time components
		System.out.println(ldt.getHour() + "\n" + ldt.getMonth() + "\n" + ldt.getYear());


		// parsing date and time strings: static ldt/ld/lt parse(CharSequence s) { iso format } || static ldt/ld/lt parse(CharSequence c, DateTimeFormatter d) {custom}
		System.out.println(ldt.parse("10-28-2021 12:00 AM", DateTimeFormatter.ofPattern("MM'-'dd'-'yyyy hh':'mm a")));		

	}
}