package samplejava;
import java.util.Scanner;
//不规则数组练习-杨辉三角，注意java的数组隐含指针的用法；
public class exercise33 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] yanghui = new int[n][];
		for (int i = 0; i < yanghui.length; i++) {
			yanghui[i] = new int[i+1];
		}
		for (int i = 0; i < yanghui.length; i++) {
			for (int j = 0; j < yanghui[i].length; j++) {
				if(i>1&&j>0&&j<i)yanghui[i][j]=yanghui[i-1][j-1]+yanghui[i-1][j];
				else yanghui[i][j]=1;		
			}
		}
		for (int[] is : yanghui) {
			for (int i : is) {
				System.out.printf("%-4d",i);
			}
			System.out.println();
		}
	}
}
