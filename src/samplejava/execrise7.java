package samplejava;
import java.util.*;
import java.lang.*;
//����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
public class execrise7 {
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int alph = 0;int blank = 0;int num =0;int symbol=0;
		for(int i=0;i<s.length();i++) {
			char[] str = s.toCharArray();
			char c = str[i];
			if(('a'<=c&&'z'>=c)||('A'<=c&&'Z'<=c))alph++;
			else if(c==' ')blank++;
			else if('0'<=c&&'9'>=c)num++;
			else symbol++;
		}
		System.out.println("alph="+alph+" blank="+blank+" num="+num+" symbol="+symbol);
			
		
	}
}
