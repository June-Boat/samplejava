/**
 * 
 */
package fileexercise;

import java.io.UnsupportedEncodingException;

public class CodeTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s="好好学习ABC";//utf16
		byte[] bytes1=s.getBytes();//这是把字符串转换成字符数组，转换成的字节序列用的是项目默认的编码（这里为UTF-8）
		for (byte b : bytes1) {
			//把字节（转换成了int）以16进制的方式显示
			//& 0xff是为了把前面的24个0去掉只留下后八位
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		
		/*gbk编码中文占用2个字节，英文占用1个字节*/
		byte[] bytes2=s.getBytes("gbk");
		for (byte b : bytes2) {
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		
		/*utf-8编码中中文占用3个字节，英文占用1个字节*/
		byte[] bytes3=s.getBytes("utf-8");
		for (byte b : bytes3) {
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		
		/*utf-16be编码中文占用2个字节，英文占用2个字节*/
		byte[] bytes4=s.getBytes("utf-16be");
		for (byte b : bytes4) {
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		
		/*当你的字节序列是某种编码时，这个时候想把字节序列变成字符串，也需要用这种编码方式，否则会出现乱码*/
		String str1=new String(bytes4);//默认使用项目编码来转换，可能出现乱码
		System.out.println(str1);
		String str2= new String(bytes4,"utf-16be");//指定编码转换
		System.out.println(str2);
	}
}
