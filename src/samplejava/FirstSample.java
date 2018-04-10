package samplejava;
import java.nio.file.Paths;
import java.util.Scanner;

public class FirstSample {
	enum Size {SAMLL,MIDIUM,LARCE,EXTRA_LARCE};

	public static final double CM_PER_INCH = 2.546;
	
	public static void main(String[] args) {
		final double CM_PER_INCH = 2.54;
		final double paperWidth =8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters:"+paperWidth*CM_PER_INCH+"by"+paperHeight*CM_PER_INCH);
		double x= 99.954;
		int nx =(int)Math.round(x);
		int ny =(int)x;
		System.out.println("nx="+nx+"\n"+"ny="+ny);
		
		
		String e = "THIS STRING IS "+String.join("/", "S","M","L","XL");
		String greeting = "hello";
		String str = greeting.substring(1,3);
		if(str!=null&&str.length()!=0)
		System.out.println(e.equals(str));
		
		String test ="中国";
		System.out.println("length="+test.length()+"\n"+test.charAt(0)+"\n"+test.charAt(test.length()-1));
		System.out.println(test.codePointCount(0, test.length()));
		
		//得到指定代码点位置的代码点值
		int index = greeting.offsetByCodePoints(0, 0);//
		int cp =greeting.codePointAt(index);
		System.out.println(cp);
		/*遍历字符串(的每个码点)，依次查看码点值
		int i=0;
		int value=greeting.codePointAt(i);
		if(Character.isSupplementaryCodePoint(value))i+=2;
		else i++;
		*/
		//回退操作
		/*i--;
		if(Character.isSurrogate(greeting.charAt(i)))i--;
		int cp2 = greeting.codePointAt(i);  */
		//字符串构建器
		StringBuilder builder = new StringBuilder();
		builder.append(test);
		builder.append(e);
		String strBuilder = builder.toString();
		System.out.println(strBuilder);
		
		//输入
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		int age = in.nextInt();
		String id = in.next();
		if(in.hasNext())
		System.out.printf("name is %s,your age is %d,the id is %s",name,age,id);
		/*
		Scanner inFile = new Scanner(Paths.get("myfile.txt"),"UTF-8");
		PrintWriter out = new PrintWriter("myfile.txt","UTF-8");
		String dir = System.getProperty("user.dir");
		*/

	}
}
