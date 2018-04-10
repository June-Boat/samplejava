package samplejava;

import java.util.Scanner;

public class execrise8 {
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		int a= in.nextInt();
	int n=in.nextInt();
	int s=0;
	int sum=0;
	
	for(int i=0;i<n;i++){
		s=s*10+a;
		sum+=s;
	}
	System.out.println(sum);
	}
	
}
