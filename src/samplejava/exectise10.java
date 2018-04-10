package samplejava;
import java.util.Scanner;
//一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
public class exectise10 {
	public static void main(String[] agrs) {
		while(true) {
		double height = 100,bouch = 0,sum = 0;
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 1;i<=n;i++) {
			sum = sum+height+bouch;
			bouch=height/2;
			height=bouch;
		}
		System.out.printf("第%d次落地共经过%.2f米，第%1$d次反弹有%.2f米高",n,sum,bouch);
		}
	}
}
