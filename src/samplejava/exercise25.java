package samplejava;
import java.util.Scanner;
//用字符串构造器得到字符串的逆序，进而判断是否回文
public class exercise25 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String n = in.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<n.length();i++) {
			sb.append(n.charAt(n.length()-1-i));
		}
		String s = sb.toString();
		if(s.equals(n))System.out.println("yes");
		else System.out.println("no");
		
	}
}
