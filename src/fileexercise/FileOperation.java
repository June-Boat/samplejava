/**
 * 
 */
package fileexercise;

import java.io.*;

/**
 * @author June-Boat createNewFile���ҽ��������ļ���������ʱ���������ļ�������true������false
 */
public class FileOperation {
	/*����Ŀ¼*/
	public static void printDirectory(File dir) {
		//���ڴ�����������쳣��ʾ��Ϣ
		if(!dir.exists())throw new IllegalArgumentException("Ŀ¼:"+dir+"������");
		if(!dir.isDirectory())throw new IllegalArgumentException("Ŀ¼"+dir+"������");
		File[] files = dir.listFiles();
		for (File file : files) {
			if(file!=null&&file.isDirectory())
				printDirectory(file);
			else
				System.out.println(file);
		}
	}
	
	public static void main(String[] args) {
		File file1 = new File("D:\\javaFileTest");
		if (!file1.exists()) {
			file1.mkdir();
		} 
	  //else { file1.delete(); }
		System.out.println("---------file1:---------");
		System.out.println(file1.isDirectory());
		System.out.println(file1.isFile());
		
		File file2 = new File("D:\\javaFileTest", "123.txt");
		System.out.println("---------file2:---------");
		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {e.printStackTrace();}
		} else {
			System.out.println("exixts");
		}
		
		System.out.println("---------file3:---------");
		File file33=new File("D:\\javaFileTest");
		File file3 = new File(file33,"123.txt");
		System.out.println(file3.compareTo(file2));
		//����APIʹ��
		System.out.println("----file2:����APIʾ��----");
		System.out.println(file2);
		System.out.println(file2.getPath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getName());
		System.out.println(file2.getParent());
		System.out.println(file2.getParentFile());
		System.out.println(file2.getAbsoluteFile());
		try {
			System.out.println(file2.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("------------�������ķָ���----------");
		System.out.println("use of printDirectory:");
		//����Ŀ¼��������
		printDirectory(new File("D:\\javaFileTest"));
	}
}