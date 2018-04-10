/**
 * 
 */
package fileexercise;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @author June-Boat
 *
 */
public class RandomAccessFileDemo {
		public static void main(String[] args) throws IOException {
			File file=new File("E:\\fileRW.dat");
			if(!file.exists())file.createNewFile();
			
			RandomAccessFile rw =new RandomAccessFile(file,"rw");
			System.out.println(rw.getFilePointer());
			rw.write('A');
			System.out.println(rw.getFilePointer());
			rw.write('b');
			
			int i=0x7fffffff;
			rw.write(i>>>24);
			rw.write(i>>>16);
			rw.write(i>>>16);
			rw.write(i>>>8);
			rw.write(i);
			System.out.println(rw.getFilePointer());
			
			rw.writeInt(i);
			
			String s="жа";
			byte[] gbk =s.getBytes("gbk");
			rw.write(gbk);
			System.out.println(rw.length());
			
			rw.seek(0);
			byte[] buf= new byte[(int)rw.length()];
			rw.read(buf);
			System.out.println(Arrays.toString(buf));
			for (byte b : buf) {
				System.out.print(Integer.toHexString(b&0xff)+" ");
			}
			rw.close();
		}
		
}
