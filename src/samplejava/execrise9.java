package samplejava;
//һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"������6=1��2��3.��� �ҳ�1000���ڵ�����������
public class execrise9 {
	public static void main(String[] agrs) {
		for(int i=0;i<=1000;i++) {
			if(isWholeNumber(i))System.out.println(i);
		}
	}
	private static boolean isWholeNumber(int n){
		int sum=0;
		for(int i=1;i<=n/2;i++)
			if(n%i==0)sum+=i;
		if(sum==n)return true;
		else return false;
	}
}
