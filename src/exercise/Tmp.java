/**
 * 
 */
package exercise;

import java.util.Arrays;

//import java.util.Arrays;

/**
 * @author June-Boat
 *
 */
public class Tmp {
	public static void main(String[] args) {
		
  		String s="wlodcikqqfgugdchkmehmegsmiaxoexvgjrdlpoeinefkbhvgrgegkitr";
		char[] c=s.toCharArray();
		int[] ci = new int[c.length];
		for (int i=0;i<c.length;i++) {
			ci[i]=c[i]-'a';
		}
		System.out.println(Arrays.toString(ci));
		System.out.println(s.toUpperCase());
		
//		String m="01011010101100111100010101010101011011110001010001";
//		String k="10010101011110101101000101000001111100100101010010";
//		char[] mc=m.toCharArray();
//		char[] kc=k.toCharArray();
//		for (int i = 0; i < kc.length; i++) {if(i%8==0)System.out.print(" ");
//			if(mc[i]==kc[i])System.out.print("0");
//			else System.out.print("1");
//		}
	}
}
