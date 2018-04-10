package exercise;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author June-Boat
 *
 */
public class DateTest {

	public static void main(String[] args) throws ParseException {
		java.text.SimpleDateFormat f = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		java.util.Date nowDate = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(nowDate.getTime());
		java.sql.Time sqlTime = new java.sql.Time(nowDate.getTime());
		java.sql.Timestamp sqlTimeStamp = new java.sql.Timestamp(nowDate.getTime());
		java.util.Calendar calendar = java.util.Calendar.getInstance();

		System.out.println(f.format(nowDate));
		System.out.println(f.format(sqlDate));
		System.out.println(f.format(sqlTime));
		System.out.println(f.format(sqlTimeStamp));
		System.out.println(f.format(calendar.getTime()));

		java.util.Date today = new java.util.Date();
		String strToday = (new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS")).format(today);
		// 日期转字符串
		System.out.println(strToday);
		// 字符串转日期
		java.util.Date today2 = (new java.text.SimpleDateFormat("yyyy-mm-dd hh:mm")).parse(strToday);
		System.out.println(today2);

		int year = 2012, month = 12, day = 31;

		Calendar c = Calendar.getInstance();
		System.out.println((new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS")).format(c.getTime()));
		c.set(year, month - 1, day);
		System.out.println(Calendar.DAY_OF_YEAR);
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println((new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS")).format(c.getTime()));

		java.text.SimpleDateFormat ft = new java.text.SimpleDateFormat("yyyyMMdd");
		String oneDateStr = "10000101", twoDateStr = "10010201";
		Calendar oneDate = Calendar.getInstance(), twoDate = Calendar.getInstance();
		long days;
		oneDate.setTime(ft.parse(oneDateStr));
		twoDate.setTime(ft.parse(twoDateStr));
		// twoDate.add(Calendar.DAY_OF_MONTH,1);
		days = twoDate.getTimeInMillis() - oneDate.getTimeInMillis();
		System.out.println(days / (3600 * 24 * 1000) + 1);
		char ca = '\u0061';
		char cb = 0x0062;

		System.out.println("ca=" + ca + "\ncb=" + cb);
		System.out.println(ca == cb);
	}

}
