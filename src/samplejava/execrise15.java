package samplejava;
//简单的九九乘法表
public class execrise15 {
	public static void main(String[] agrs) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(j+"*"+i+"\t");
			System.out.println();	
		}
	}
}
