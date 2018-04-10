/**
 * 
 */
package designer;

import java.io.IOException;

/**
 * @author June-Boat
 * 单例设计模式
 * 开发时用饿汉式，原因如下
 * 饿汉式用空间换取时间
 * 懒汉式在多线程条件下，可能会创建多个对象。
 */
public class SingletonDemo {
	public static void main(String[] args) {
		Singleton1 s1=Singleton1.getInstance();
		Singleton2 s2=Singleton2.getInstance();
		Singleton3 s3=Singleton3.s;
//		Singleton3.s=null;//编译错误
		/*
		 * 实验Runtime类——单例设计模式的实现
		 * Runtime类代表着Java程序的运行时环境
		 * 常用方法有获取jvm内存信息、可用的处理器核心数量、执行系统命令
		 */
		//1.获取当前jvm的内存信息
		Runtime r=Runtime.getRuntime();
		//获取可用内存
		long free=r.freeMemory();
		System.out.println("可用内存为："+free/1024/1024+"MB");
		//获取jvm的当前总内存，该值会不断变化
		long totalMemory=r.totalMemory();
		System.out.println("全部内存为："+totalMemory/1024/1024+"MB");
		//获取jvm可以最大使用的内存数量，若无限制返回Long.MAX_VALUE
		long max=r.maxMemory();
		System.out.println("可用最大内存为："+max/1024/1024+"MB");
		
		//2.获取jvm可用的处理器核心的数量
		int countProcessors=r.availableProcessors();
		System.out.println("可用处理器核心数量："+countProcessors);
		
		//3.执行系统命令
		try {
			r.exec("calc");//执行cmd下的命令操作，windows下
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
 * 饿汉式 加载便创建了对象；
 */

class Singleton1{
	//私有的构造方法，不然其他类创建对象
	private Singleton1() {}
	//自持有一个对象
	private static Singleton1 s=new Singleton1();
	//向外提供获取唯一对象的接口
	public static Singleton1 getInstance() {
		return s;
	}
}
/*
 * 懒汉式 单例的延迟加载模式 面试题
 */
class Singleton2{
	private Singleton2() {}
	private static Singleton2 s;
	public static Singleton2 getInstance() {
		if(s==null)s=new Singleton2();
		return s;
	}
}
/*
 * 第三种方法
 * 实现单例的关键是只有一个实例对象，且不能被外界改变
 * 则亦可使用final来时对象引用固定
 */
class Singleton3{
	private Singleton3() {}
	//对外提供一个不可改变引用的对象
	public static final Singleton3 s =new Singleton3();
}