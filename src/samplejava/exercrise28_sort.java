package samplejava;
import java.util.Arrays;
import java.util.Scanner;
//�������򷽷���������
public class exercrise28_sort {
	public static void main(String[] agrs) {
		int a[] = {1,5,2,4,8,9,7,5,1,3,6,4};
		sortQuick(a,0,a.length-1);
		System.out.println(Arrays.toString(a));	
		/*��һ���Ѿ��ź�������顣������һ������Ҫ��ԭ���Ĺ��ɽ������������С���������򷽷����
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
	private static void sortBubble(int[] a) {//ð������
		// ��������Ƿ�����˽����ı�־flag�����û�н�����flag==0������ǰ�˳�
		for (int i = 0; i < a.length-1; i++) {	//���ѭ������
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
	private static void sortQuick(int[] a,int start,int end) {//�������򣬷��ν�������
		// TODO Auto-generated method stub
		if(start<end) {
			int middle = getMiddle(a,start,end);//һ�����򣬲�������ֵ�±꣨���ڷֶε��±꣩
			sortQuick(a, start, middle-1);
			sortQuick(a, middle+1, end);
		}
	}
	private static int getMiddle(int a[],int start,int end) {
		// TODO Auto-generated method stub
		int privot = a[start];
		/*����������ͨ������Ϊ��ͬ��������O(nlog2n)�������򷽷���ƽ��������õġ�
		 * ������ʼ���а��ؼ���������������ʱ�������򷴶��ɻ�Ϊð������
		 * Ϊ�Ľ�֮��ͨ���ԡ�����ȡ�з�����ѡȡ��׼��¼��������������������˵����е�������¼�ؼ�����еĵ���Ϊ֧���¼��
		 * ����������һ�����ȶ������򷽷���
		 */
		/*int privot = a[start]<a[end]?a[end]:a[start];
		 *privot = privot<a[(start+end)/2]?<a[(start+end)/2]:privot; 
		 */
		while(start<end) {//�ж�ֵ��СʱҪ�ӵȺţ�������ֵͬ�������ѭ��
		while(start<end&&privot<=a[end])end--;	a[start]=a[end];
		while(start<end&&privot>=a[start])start++;	a[end]=a[start];
		}
		a[start]=privot;
		return start;
	}

}
