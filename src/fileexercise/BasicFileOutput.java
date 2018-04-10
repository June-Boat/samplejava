/**
 * 
 */
package fileexercise;

import java.io.*;


/**
 * @author June-Boat
 *
 */
public class BasicFileOutput {
	public static void main(String[] args) throws IOException {
	//LineNumberReader extends BufferedReader
	LineNumberReader in = new LineNumberReader(new FileReader("D:\\javaFileTest\\123.txt"));
	PrintWriter out=new PrintWriter("D:\\javaFileTest\\123copy.txt");
	String s;
	while((s=in.readLine())!=null) {
		out.println(in.getLineNumber()+":"+s);
	}
	in.close();out.close();
	System.out.println(BufferedInputFile.read("D:\\javaFileTest\\123copy.txt"));
	}
	

}
