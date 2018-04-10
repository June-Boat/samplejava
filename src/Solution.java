import java.util.Scanner;

/**
 * 
 */

/**
 * @author June-Boat
 *
 */
public class Solution {
	public static String intToRoman(int num) {
	    String M[] = {"", "M", "MM", "MMM"};
	    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
	    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	    return M[(num%10000)/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
	}
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num= in.nextInt();
		while(num!=0) {
			System.out.println(intToRoman(num));
			num=in.nextInt();
		}
		System.out.println("½áÊø");
	}
}
