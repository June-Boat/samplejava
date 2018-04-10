/**
 * 
 */
package fileexercise;

import java.io.*;

/**
 * @author June-Boat
 *
 */
public class FormattedMemoryInput {
	public static void main(String[] args) {

		try {
			DataInputStream in;
			in = new DataInputStream(
					new ByteArrayInputStream(BufferedInputFile.read("FormattedMemoryInput.java").getBytes()));
			while (true)
				System.out.println((char) in.readByte());
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("End of File");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException");
		}

	}
}
