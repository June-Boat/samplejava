/**
 * 
 */

/**
 * @author June-Boat
 *������ĳ�Ա�̳У�
 *���෽���з��ʵĻ��Ǹ����color
 *�²⣺�����м̳���Ϣ�������̳еĸ��࣬
 *���������÷����ͷ��ʱ���ʱ��ͨ������Ϣ�ҵ��������Ϣ��ʹ��
 *��ԭ�򣬸�����Ϊ������ʽ����this����this.color��
 */
class fatherClass{
	int color=1;
	void say() {
		System.out.println(color);
	}
}

class sonClass extends fatherClass{
	//int color=0;
	float color=3;
	void sayOfSon(){
		System.out.println(super.color);
	}
}

public class extendsTest {
	public static void main(String[] args) {
//		fatherClass father =new fatherClass();
//		sonClass son= new sonClass();
//		father.say();
//		son.say();
//		son.sayOfSon();
		
		long n=2000000000000L;
		System.out.println("n��"+Long.toBinaryString(n));
	}
}
