package samplejava;
import java.util.Arrays;
import java.util.Scanner;
//常见排序方法，理解过程
public class exercrise28_sort {
	public static void main(String[] agrs) {
		int a[] = {1,5,2,4,8,9,7,5,1,3,6,4};
		sortQuick(a,0,a.length-1);
		System.out.println(Arrays.toString(a));	
		/*有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。亦可以排序方法解决
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b[] = new int[a.length+1];int i = 0;
		for (;i < b.length-1; i++) {
			if(a[i]>n) {b[i]=n;break;}
			else b[i]=a[i];
		}
		if(i==a.length)b[i]=n;
		else while(i<b.length) {b[i]=a[i-1];i++;}
		System.out.println(Arrays.toString(b));
		*/
	}
	private static void sortBubble(int[] a) {//冒泡排序
		// 这里加了是否进行了交换的标志flag，如果没有交换即flag==0，可提前退出
		for (int i = 0; i < a.length-1; i++) {	//外层循环次数
			int flag = 0;
			for (int j = 0; j < a.length-i-1; j++) { 
				if(a[j]<a[j+1]) {
					a[j]^=a[j+1];a[j+1]^=a[j];a[j]^=a[j+1];
					flag=1;
				}
			}
			if(flag==0)break;
		}
		System.out.println(Arrays.toString(a));	
	}
	private static void sortQuick(int[] a,int start,int end) {//快速排序，分治进行排序
		// TODO Auto-generated method stub
		if(start<end) {
			int middle = getMiddle(a,start,end);//一趟排序，并返回中值下标（用于分段的下标）
			sortQuick(a, start, middle-1);
			sortQuick(a, middle+1, end);
		}
	}
	private static int getMiddle(int a[],int start,int end) {
		// TODO Auto-generated method stub
		int privot = a[start];
		/*快速排序是通常被认为在同数量级（O(nlog2n)）的排序方法中平均性能最好的。
		 * 但若初始序列按关键码有序或基本有序时，快排序反而蜕化为冒泡排序。
		 * 为改进之，通常以“三者取中法”来选取基准记录，即将排序区间的两个端点与中点三个记录关键码居中的调整为支点记录。
		 * 快速排序是一个不稳定的排序方法。
		 */
		/*int privot = a[start]<a[end]?a[end]:a[start];
		 *privot = privot<a[(start+end)/2]?<a[(start+end)/2]:privot; 
		 */
		while(start<end) {//判断值大小时要加等号，考虑相同值而造成死循环
		while(start<end&&privot<=a[end])end--;	a[start]=a[end];
		while(start<end&&privot>=a[start])start++;	a[end]=a[start];
		}
		a[start]=privot;
		return start;
	}

}
