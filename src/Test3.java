/**
 * 
 */

/**
 * @author June-Boat
 *
 */

import java.util.Scanner;
public class Test3 {
 
    //�ݹ������i��ʼ�ĳ���Ϊk���������ĸ�����ǰ��������
    int amount(int i, int k) {
        int sum = 0;
        if (k == 1) {
            return 1;
        } else {
            for (int j = i + 1; j <= 26; j++) {
                sum += amount(j, k - 1);
            }
        }
        return sum;
    }
//���㳤��Ϊk��������ϵĸ�����ǰ��������
 
    int amountZuhe(int k) {
        int sum = 0;
        for (int i = 1; i <= 26; i++) {
            sum += amount(i, k);
        }
        return sum;
    }
//ת��������
 
    int toInt(char c) {
        return c - 'a' + 1;
    }
//����һ���ַ�������һ�����
 
    int getResult(String s) {
        int k = s.length();
        int sum = 0, temp = 0;
        //��ȡ1~k-1���ȵ����ַ�����
        for (int i = 1; i < k; i++) {
            sum += amountZuhe(i);
        }
 
        //С�ڵ�һ����ĸ�ĳ���Ϊk��������ϸ���
        for (int i = 1; i < toInt(s.charAt(0)); i++) {
            sum += amount(i, k);
        }
 
        //�Ե�һ����ĸ��Ϊ��ʼ���ַ�����ϸ���
        temp = toInt(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int t = toInt(s.charAt(i));    //��ȡ��ʱ����ĸ��ת��������
            int len = s.length() - i;    //��ȡ��ʱ�ĳ���
            for (int j = temp + 1; j < t; j++) //��ȡ�ȴ�ʱ����С�������Ǵ�ʱ�ĳ��ȵ�������ϵĸ���
            {
                sum += amount(j, len);
            }
            temp = t;                    //��ȡ��ǰ�ַ�ֵ��������һ�δӴ���+1�ʼ�ۼ�
        }
        return sum + 1;
    }
 
    public static void main(String[] args) {
        Test3 test3 = new Test3();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str[] = new String[a + 1];
        for (int i = 1; i <= a; i++) {
            str[i] = sc.next();
        }
        for (int i = 1; i <= a; i++) {
            System.out.println(test3.getResult(str[i]));
        }
 
    }
}