package samplejava;

import java.util.Scanner;

//����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿
public class execrise14 {
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year=in.nextInt();
		System.out.println("�������·ݣ�");
		int month= in.nextInt();
		System.out.println("���������ڣ�");
		int day= in.nextInt();
		int sum=0;
		switch(month-1) {
		case 11:sum+=30;
		case 10:sum+=31;
		case 9:sum+=30;
		case 8:sum+=31;
		case 7:sum+=31;
		case 6:sum+=30;
		case 5:sum+=31;
		case 4:sum+=30;
		case 3:sum+=31;
		case 2:sum+=28;
		case 1:sum+=31;
		}
		if(year%400==0||(year%4==0&&year%100!=0))sum++;
		sum+=day;
		System.out.println(sum);
	}

	
}
