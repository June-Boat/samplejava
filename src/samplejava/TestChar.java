/**
 * 
 */
package samplejava;
import java.io.*;
/**
 * @author June-Boat
 *	练习字符流输入输出操作
 */
public class TestChar {
	public static void main(String[] agrs) {
		FileReader fr=null;
		FileWriter fw =null;
		BufferedReader bufferedReader = null;
		try {
			fr=new FileReader("./input.txt");
			fw=new FileWriter("./output.txt");
			char[] buffer = new char[1000];
			while(true){
					int temp=fr.read(buffer,0,buffer.length);
					if(temp==-1)break;
					fw.write(buffer, 0, temp);		
			}
		
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
			fr.close();
			fw.close();
			}catch(Exception x){
				System.out.println(x);
			}
		}
	}
}
