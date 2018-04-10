/**
 * 
 */
package fileexercise;

import java.io.*;

import java.util.LinkedList;
import java.util.List;

/**
 * @author June-Boat
 *
 */
public class BufferedFileOutput {
	public static void main(String[] args) throws IOException {
		
		//p543 ¡∑œ∞12
		BufferedReader in = new BufferedReader(new FileReader("D:\\javaFileTest\\123.txt"));
		String s;
		List<String> list = new LinkedList<>();
		while ((s = in.readLine()) != null) {
			list.add(s);
		}
		int lineCount=1;
		//”Îœ¬Õ¨ PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("D:\\javaFileTest\\123copy.txt")));
	    PrintWriter out = new PrintWriter("D:\\javaFileTest\\123copy.txt");
	    for (String string : list) {
			out.println(lineCount++ +string);
		}
		in.close();
		out.close();
		
		//p543 ¡∑œ∞13
		
		
	}
}
