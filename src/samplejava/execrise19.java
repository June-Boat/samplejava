package samplejava;
//打印出如下图案（菱形）
public class execrise19 {
	public static void main(String[] agrs) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for(int j=1;j<=6-2*i-1;j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}
