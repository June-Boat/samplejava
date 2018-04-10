import java.time.LocalDate;
/**
 * @author June-Boat
 *��ϰ�˽���LocalDate��ķ���ʹ��
 *����Ϊ������ǰ���ڵ�������
 */
public class CalendarTest {
	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		date=date.minusDays(today-1);//����Ϊ����1��
		int value=date.getDayOfWeek().getValue();//����1����������
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for(int i=1;i<value;i++)
			System.out.print("    ");
		while(date.getMonthValue()==month) {//�����ڵ����˳�
			System.out.printf("%3d",date.getDayOfMonth());
			if(date.getDayOfMonth()==today)
				System.out.print("*");
			else
				System.out.print(" ");
			date=date.plusDays(1);
			if(date.getDayOfWeek().getValue()==1)System.out.println();//����һ���ǰ����
		}
		if(date.getDayOfWeek().getValue()!=1)System.out.println();
	}
}
