package samplejava;
//��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮�͡�
public class execrise20 {
	public static void main(String[] agrs) {
		double sum=0,n=0;
		double a=1,b=1,c=0;
		for(int i=1;i<=20;i++) {
			c=a+b;
			n=c/b;sum+=n;
			a=b;b=c;
		}
		System.out.println(sum);
	}
}
