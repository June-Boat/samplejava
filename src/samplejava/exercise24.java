package samplejava;

import java.util.Scanner;
//��һ��������5λ����������Ҫ��һ�������Ǽ�λ�������������ӡ����λ���֡�
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
		System.out.println("�������"+n+"λ����������������"+newNum);
		
	}
}
