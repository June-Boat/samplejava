/**
 * 
 */
package fileexercise;
import java.io.*;
/**
 * @author June-Boat
 *
 */
public class FrAndFwDemo {
	public static void main(String[] args) throws IOException {
		FileReader in=new FileReader("filetest.txt");
		FileWriter out = new FileWriter("filetest2.txt");
		char[]	buffer=new char[128];
		int c;
		while((c=in.read(buffer, 0, buffer.length))!=-1) {
			out.write(buffer, 0, c);
			out.flush();
		}
		out.close();in.close();
	}
}
