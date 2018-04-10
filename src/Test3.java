/**
 * 
 */

/**
 * @author June-Boat
 *
 */

import java.util.Scanner;
public class Test3 {
 
    //递归计算以i开始的长度为k的所有数的个数，前提是升序
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
//计算长度为k的所有组合的个数，前提是升序
 
    int amountZuhe(int k) {
        int sum = 0;
        for (int i = 1; i <= 26; i++) {
            sum += amount(i, k);
        }
        return sum;
    }
//转换成数字
 
    int toInt(char c) {
        return c - 'a' + 1;
    }
//给出一个字符串返回一个序号
 
    int getResult(String s) {
        int k = s.length();
        int sum = 0, temp = 0;
        //获取1~k-1长度的子字符串数
        for (int i = 1; i < k; i++) {
            sum += amountZuhe(i);
        }
 
        //小于第一个字母的长度为k的所有组合个数
        for (int i = 1; i < toInt(s.charAt(0)); i++) {
            sum += amount(i, k);
        }
 
        //以第一个字母作为开始的字符串组合个数
        temp = toInt(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int t = toInt(s.charAt(i));    //获取此时的字母并转化成数字
            int len = s.length() - i;    //获取此时的长度
            for (int j = temp + 1; j < t; j++) //获取比此时数字小，长度是此时的长度的所有组合的个数
            {
                sum += amount(j, len);
            }
            temp = t;                    //获取当前字符值，方便下一次从此项+1项开始累加
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