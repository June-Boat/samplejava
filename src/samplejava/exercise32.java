package samplejava;

import java.util.Scanner;
//取一个整数a从右端开始的4～7位。
public class exercise32 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		String ns = String.valueOf(n);
		System.out.println(ns.substring(ns.length()-7, ns.length()-3));
		
		char[] nsc = ns.toCharArray();//字符串转字符
		for (int i = 0; i < 4; i++) {
			System.out.print(nsc[nsc.length-4-i]);
		}
	}
}
