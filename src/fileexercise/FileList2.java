/**
 * 
 */
package fileexercise;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author June-Boat 利用递归搜索设定目录的全部内容
 */
public class FileList2 {
	public static void main(String[] args) {
		File path = new File(".");
		String[] list;
		if (args.length == 0)
			list = path.list();
		else
			list = path.list(
					/*
					 * new FileFilter() {
					 * 
					 * @Override public boolean accept(File pathname) { // TODO Auto-generated
					 * method stub return false; }
					 * 
					 * }
					 */

					new FilenameFilter() {
						private Pattern pattern = Pattern.compile(args[0]);

						@Override
						public boolean accept(File dir, String name) {
							return pattern.matcher(name).matches();
						}
					});
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String string : list) {
			System.out.println(string);
		}
	}

	public static void print(File f) {
		if (f != null)
			if (f.isDirectory()) {
				File filelist[] = f.listFiles();
				if (filelist != null)// 当文件夹为空时，返回null
					for (File ft : filelist) {
						print(ft);
					}
			} else {
				System.out.println(f);
			}
	}
}
