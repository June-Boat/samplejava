import java.util.Scanner;

public class Caesar {
	public void mj(){
		Scanner in = new Scanner(System.in);
		System.out.print("请选择操作（1.加密 2.解密）:");
		int n = in.nextInt();
		if (n == 1){
			System.out.print("请输入待加密的字符串：");
			String str = in.next();
			String jm = "";
			int key = 3;// 凯撒密码加密，向后移位3位
			for (int i = 0; i < str.length(); i++){
				char c = str.charAt(i);
				if (c >= 'a' && c <= 'z'){
					if (c >= 'x' && c <= 'z'){
						c -= 26;
						c += key;
					}
					else{c += key;}
				}
				else if (c >= 'A' && c <= 'Z'){
					if (c >= 'X' && c <= 'Z'){
						c -= 26;
						c += key;
					}
					else{c += key;}
				}
				jm += c;
			}
			System.out.print("加密后的字符串是：" + jm);
		}
		else if (n == 2)
		{
			System.out.print("请输入待解密的字符串：");
			String str = in.next();
			String jm = "";
			int key = -3;// 凯撒密码解密，向前移位3位
			for (int i = 0; i < str.length(); i++)
			{
				char c = str.charAt(i);
				if (c >= 'a' && c <= 'z'){
					if (c >= 'a' && c <= 'c'){
						c += 26;
						c += key;
					}
					else{c += key;}
				}
				else if (c >= 'A' && c <= 'Z'){
					if (c >= 'A' && c <= 'C'){
						c += 26;
						c += key;
					}
					else{c += key;}
				}
				jm += c;
			}
			System.out.println("解密后的字符串：" + jm);
		}
	}
	public static void main(String[] args){
		Caesar caesar = new Caesar();
		caesar.mj();
	}
}
