/**
 * 
 */
package samplejava;
import java.io.*;
/**
 * @author June-Boat
 *	练习字符处理流操作
 */
public class TestBufferedReader {
	public static void main(String[] agrs) {
		FileReader fr=null;
		FileWriter fw =null;
		BufferedReader bufferedReader = null;
		try {
			fr=new FileReader("./input.txt");
			//fw=new FileWriter("./output.txt");
			bufferedReader = new BufferedReader(fr);
			char[] buffer = new char[1000];
			while(true){
					String str=bufferedReader.readLine();
					if(str==null)break;
					System.out.println(str);
			}
		
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
			fr.close();
			//fw.close();
			bufferedReader.close();
			}catch(Exception x){
				System.out.println(x);
			}
		}
	}
}
