/**
 * 
 */
package fileexercise;

import java.io.*;

/**
 * @author June-Boat createNewFile当且仅当抽象文件名不存在时，创建该文件并返回true，否则false
 */
public class FileOperation {
	/*遍历目录*/
	public static void printDirectory(File dir) {
		//对于错误情况，用异常提示信息
		if(!dir.exists())throw new IllegalArgumentException("目录:"+dir+"不存在");
		if(!dir.isDirectory())throw new IllegalArgumentException("目录"+dir+"不存在");
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
		//常见API使用
		System.out.println("----file2:常用API示例----");
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
		
		System.out.println("------------华丽丽的分割线----------");
		System.out.println("use of printDirectory:");
		//遍历目录函数调用
		printDirectory(new File("D:\\javaFileTest"));
	}
}