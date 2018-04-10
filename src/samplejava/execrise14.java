package samplejava;

import java.util.Scanner;

//输入某年某月某日，判断这一天是这一年的第几天？
public class execrise14 {
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year=in.nextInt();
		System.out.println("请输入月份：");
		int month= in.nextInt();
		System.out.println("请输入日期：");
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
