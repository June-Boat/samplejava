/**
 * 
 */
package runnabletest;
import static net.mindview.util.Print.*;

import java.util.concurrent.TimeUnit;
/**
 * @author June-Boat
 *
 */
/***********通过外部类的构造方法来创建内部类并使用************/
/*使用Thread内部类*/
class InnerThread1{
	private int countDown=5;
	private Inner inner;
	private class Inner extends Thread{
		Inner(String name){
			super(name);
			start();
		}
		public void run() {
			try {
				while(true) {
				print(this);
				if(--countDown==0)return;
				sleep(10);
				}
			} catch (Exception e) {
				print("interrupted");
			}
		}
		public String toString() {
			return getName()+"(" + countDown + "),";
		}
	}
	public InnerThread1(String name) {
		inner=new Inner(name);
	}
}
/*使用Thread的匿名内部类*/
class InnerThread2{
	private int countDown=5;
	private Thread t;
	public InnerThread2(String name) {
		t=new Thread(name) {
			public void run() {
				try {
					while(true) {
					print(this);
					if(--countDown==0)return;
					sleep(10);
					}
				} catch (Exception e) {
					print("interrupted");
				}
			}
			public String toString() {
				return getName()+"(" + countDown + "),";
			}
		};
		t.start();
	}
}
/*使用实现Runnable的内部类*/
class InnerRunnable1{
	private int countDown=5;
	private Inner inner;
	private class Inner implements Runnable {
		Thread t;
		public Inner(String name) {
			t=new Thread(this,name);
			t.start();
		}
		@Override
		public void run() {
			try {
				while(true) {
				print(this);
				if(--countDown==0)return;
				TimeUnit.MILLISECONDS.sleep(10);
				}
			} catch (Exception e) {
				print("interrupted");
			}
		}
		public String toString() {
			return t.getName()+"(" + countDown + "),";
		}
	}
	public InnerRunnable1(String name) {
		inner=new Inner(name);
	}
}
/*使用实现Runnable的匿名内部类*/
class InnerRunnable2{
	private int countDown=5;
	private Thread t;
	public InnerRunnable2(String name) {
		t=new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					while(true) {
					print(this);
					if(--countDown==0)return;
					TimeUnit.MILLISECONDS.sleep(10);
					}
				} catch (Exception e) {
					print("interrupted");
				}
			}
			public String toString() {
				return Thread.currentThread().getName()+"(" + countDown + "),";
			}
		},name);
		t.start();
	}
}
/***********通过外部类的其他方法来创建内部类并使用************/
class ThreadMethod{
	private int countDown=5;
	private Thread t;
	private String name;
	public ThreadMethod(String name) {this.name=name;}
	public void runTask() {
		if(t==null) {
			t=new Thread(name) {
				public void run() {
					try {
						while(true) {
						print(this);
						if(--countDown==0)return;
						TimeUnit.MILLISECONDS.sleep(10);
						}
					} catch (Exception e) {
						print("interrupted");
					}
				}
				public String toString() {
					return Thread.currentThread().getName()+"(" + countDown + "),";
				}
			};
		}
		t.start();
	}
}

public class ThreadVariations {
	public static void main(String[] args) {
		new InnerThread1("InnerThread1");
		new InnerThread2("InnerThread2");
		new InnerRunnable1("InnerRunnable1");
		new InnerRunnable2("InnerRunnable2");
		new ThreadMethod("ThreadMethod").runTask();
	}
}
