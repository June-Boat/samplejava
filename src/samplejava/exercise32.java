package samplejava;

import java.util.Scanner;
//ȡһ������a���Ҷ˿�ʼ��4��7λ��
public class exercise32 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		String ns = String.valueOf(n);
		System.out.println(ns.substring(ns.length()-7, ns.length()-3));
		
		char[] nsc = ns.toCharArray();//�ַ���ת�ַ�
		for (int i = 0; i < 4; i++) {
			System.out.print(nsc[nsc.length-4-i]);
		}
	}
}
