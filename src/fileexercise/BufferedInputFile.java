/**
 * 
 */
package fileexercise;

import java.io.*;
import java.util.*;

/**
 * @author June-Boat
 *
 */
public class BufferedInputFile {
	//p540 Àý×Ó
	public static String read(String filename) throws IOException{
		BufferedReader in=new BufferedReader(new FileReader(filename));
		String s;
		StringBuilder sb=new StringBuilder();
		while((s=in.readLine())!=null) {
			sb.append(s+"\n");
		}
		in.close();
		return sb.toString();
	}
	//p540 Á·Ï°7
	public static void readThenPrintReverse(String filename) throws IOException {
		BufferedReader in=new BufferedReader(new FileReader(filename));
		String s;
		List<String> list=new LinkedList<>();
		while((s=in.readLine())!=null) {
			list.add(s);
		}
		ListIterator<String> it=list.listIterator(list.size());
		while(it.hasPrevious()) {
			System.out.print(it.previous()+" ");
		}
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(read("D:\\javaFileTest\\123.txt"));
		readThenPrintReverse("D:\\javaFileTest\\123.txt");
	}
}
