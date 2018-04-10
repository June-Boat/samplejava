

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mtoc {

	// 输入明文和密钥，用输入的密钥对明文进行加密
	public static void main(String[] args) {
		int i;
		char[] c = new char[100];
		char[] k1 = new char[100];

		// 输入
		System.out.print("enter a mingwen string:");
		String m = MyInput.readString();
		System.out.print("enter a key string:");
		String k = MyInput.readString();

		// 构造密钥对照表

		for (i = 0; i < k.length(); i++) {
			if (k.charAt(i) >= 'a' && k.charAt(i) <= 'z')
				k1[i] = (char) (k.charAt(i) - 97);
			if (k.charAt(i) >= 'A' && k.charAt(i) <= 'Z')
				k1[i] = (char) (k.charAt(i) - 65);
		}

		// 加密

		for (i = 0; i < m.length(); i++) {
			if (m.charAt(i) >= 'a' && m.charAt(i) <= 'z')
				c[i] = (char) ((m.charAt(i) - 97 + k1[i % k.length()]) % 26 + 97);
			if (m.charAt(i) >= 'A' && m.charAt(i) <= 'Z')
				c[i] = (char) ((m.charAt(i) - 65 + k1[i % k.length()]) % 26 + 65);
		}

		// 输出密文
		for (i = 0; i < c.length; i++)
			System.out.print(c[i]);
	}

}

class MyInput {
	// Read a string from the keyboard
	public static String readString() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);

		// Declare and initialize the string
		String string = "";

		// Get the string from the keyboard
		try {
			string = br.readLine();
		} catch (IOException ex) {
			System.out.println(ex);
		}

		// Return the string obtained from the keyboard
		return string;
	}

	// Read an int value from the keyboard
	public static int readInt() {
		return Integer.parseInt(readString());
	}

	// Read a double value from the keyboard
	public static double readDouble() {
		return Double.parseDouble(readString());
	}

	// Read a byte value from the keyboard
	public static byte readByte() {
		return Byte.parseByte(readString());
	}

	// Read a short value from the keyboard
	public static short readShort() {
		return Short.parseShort(readString());
	}

	// Read a long value from the keyboard
	public static long readLong() {
		return Long.parseLong(readString());
	}

	// Read a float value from the keyboard
	public static float readFloat() {
		return Float.parseFloat(readString());
	}
}