import java.util.Calendar;
public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		// get()은 0~30까지의 정수 리턴.
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.print(msg + year + "/" + month + "/" + day + '\n');
		System.out.print("" + hourOfDay + "시 ");
		System.out.println(minute + "분 " + second + "초"
		);
		}
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		printCalendar("", now);
	}
}
