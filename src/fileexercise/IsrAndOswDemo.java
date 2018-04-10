/**
 * 
 */
package fileexercise;
import java.io.*;
/**
 * @author June-Boat
 *
 */
public class IsrAndOswDemo {
	public static void main(String[] args) throws IOException {
	/*	FileInputStream in= new FileInputStream("filetest.txt");
		InputStreamReader isr=new InputStreamReader(in,"utf-8");*/
		FileReader isr=new FileReader("filetest.txt");//按项目默认编码解析
		
/*		FileOutputStream out =new FileOutputStream("filetestcopy.txt");
		OutputStreamWriter osw=new OutputStreamWriter(out,"gbk");*/
		FileWriter osw=new FileWriter("filetestcopy.txt");
		char[] buffer = new char[8*1024];
		int c;
		//
		while((c=isr.read(buffer))!=-1) {
			String s=new String(buffer,0,c);
			System.out.print(s);
			osw.write(buffer, 0, c);
			osw.flush();
		}
		osw.close();isr.close();
	}
}
