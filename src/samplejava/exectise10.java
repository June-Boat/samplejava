package samplejava;
import java.util.Scanner;
//һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������� ��10�����ʱ�������������ף���10�η�����ߣ�
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
		System.out.printf("��%d����ع�����%.2f�ף���%1$d�η�����%.2f�׸�",n,sum,bouch);
		}
	}
}
