package samplejava;

import java.util.Scanner;
//��һ��3*3����Խ���Ԫ��֮��
public class exercise29 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] n = new int[3][3];
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = in.nextInt();

			}
			
		}
		for (int[] is : n) {
			for (int j : is) {
				System.out.println(j);
			}
		}
		
	}
}
