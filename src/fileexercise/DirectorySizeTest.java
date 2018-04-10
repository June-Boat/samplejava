/**
 * 
 */
package fileexercise;

import java.io.File;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author June-Boat
 *
 */
public class DirectorySizeTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String file = in.nextLine();
		System.out.println(file);
		File f = new File(file);
		long size = GetDirectorySize(f);
		System.out.printf("%.2fKB", (size / 1024D));

	}

	/*
	 * 判断是否为文件夹，是获得file集合列表，长度不为0是递归，对列表递归调用 否则记录大小
	 */
	public static long GetDirectorySize(File file) {
		long size = 0;
		if (!file.exists())
			return 0;
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			if (files.length != 0)
				for (File f : files) {
					size += GetDirectorySize(f);
				}
		} else
			size += file.length();
		return size;
	}

	public static long GetDirectorySize2(File file) {
		long size = 0;
		if (!file.exists())
			return 0;
		File[] files = file.listFiles();
		for (File f : files) {
			if (f != null && f.isDirectory())
				size += GetDirectorySize(f);
			else
				size += f.length();
		}
		return size;
	}

	public static String getFormatSize(double size) {
		double kiloByte = size / 1024;
		if (kiloByte < 1) {
			return size + "Byte(s)";
		}

		double megaByte = kiloByte / 1024;
		if (megaByte < 1) {
			BigDecimal result1 = new BigDecimal(Double.toString(kiloByte));
			return result1.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "KB";
		}

		double gigaByte = megaByte / 1024;
		if (gigaByte < 1) {
			BigDecimal result2 = new BigDecimal(Double.toString(megaByte));
			return result2.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "MB";
		}

		double teraBytes = gigaByte / 1024;
		if (teraBytes < 1) {
			BigDecimal result3 = new BigDecimal(Double.toString(gigaByte));
			return result3.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "GB";
		}
		BigDecimal result4 = new BigDecimal(teraBytes);
		return result4.setScale(2, BigDecimal.ROUND_HALF_UP).toPlainString() + "TB";
	}
}
