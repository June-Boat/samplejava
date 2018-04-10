package samplejava;

import java.util.Scanner;
//给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
public class exercise24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num =in.nextInt();
		int n=1,newNum=0;
		while(num/10!=0) {
			newNum=newNum*10+num%10;
			num/=10;n++;
		}
		newNum=newNum*10+num;
		System.out.println("这个数有"+n+"位数，它的逆序数是"+newNum);
		
	}
}
