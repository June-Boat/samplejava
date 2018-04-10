/**
 * 
 */
package fileexercise;

import java.io.UnsupportedEncodingException;

public class CodeTest {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s="�ú�ѧϰABC";//utf16
		byte[] bytes1=s.getBytes();//���ǰ��ַ���ת�����ַ����飬ת���ɵ��ֽ������õ�����ĿĬ�ϵı��루����ΪUTF-8��
		for (byte b : bytes1) {
			//���ֽڣ�ת������int����16���Ƶķ�ʽ��ʾ
			//& 0xff��Ϊ�˰�ǰ���24��0ȥ��ֻ���º��λ
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		
		/*gbk��������ռ��2���ֽڣ�Ӣ��ռ��1���ֽ�*/
		byte[] bytes2=s.getBytes("gbk");
		for (byte b : bytes2) {
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		
		/*utf-8����������ռ��3���ֽڣ�Ӣ��ռ��1���ֽ�*/
		byte[] bytes3=s.getBytes("utf-8");
		for (byte b : bytes3) {
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		
		/*utf-16be��������ռ��2���ֽڣ�Ӣ��ռ��2���ֽ�*/
		byte[] bytes4=s.getBytes("utf-16be");
		for (byte b : bytes4) {
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		
		/*������ֽ�������ĳ�ֱ���ʱ�����ʱ������ֽ����б���ַ�����Ҳ��Ҫ�����ֱ��뷽ʽ��������������*/
		String str1=new String(bytes4);//Ĭ��ʹ����Ŀ������ת�������ܳ�������
		System.out.println(str1);
		String str2= new String(bytes4,"utf-16be");//ָ������ת��
		System.out.println(str2);
	}
}
