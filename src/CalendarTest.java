import java.time.LocalDate;
/**
 * @author June-Boat
 *练习了解下LocalDate类的方法使用
 *本例为制作当前日期的日历表
 */
public class CalendarTest {
	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		date=date.minusDays(today-1);//设置为当月1号
		int value=date.getDayOfWeek().getValue();//该月1号所属星期
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for(int i=1;i<value;i++)
			System.out.print("    ");
		while(date.getMonthValue()==month) {//不属于当月退出
			System.out.printf("%3d",date.getDayOfMonth());
			if(date.getDayOfMonth()==today)
				System.out.print("*");
			else
				System.out.print(" ");
			date=date.plusDays(1);
			if(date.getDayOfWeek().getValue()==1)System.out.println();//星期一输出前换行
		}
		if(date.getDayOfWeek().getValue()!=1)System.out.println();
	}
}
