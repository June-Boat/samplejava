/**
 * 
 */
package generic;

import java.util.Iterator;
import java.util.Random;

/**
 * @author June-Boat
 *
 */
class StoryCharacter{
	private static long counter=0;
	private final long id=counter++;
	public String toString(){
		return getClass().getSimpleName()+ " "+id;
	}
}
class GoodGuys extends StoryCharacter{}
class BadGuys extends StoryCharacter{}
class Murderer extends BadGuys{}
class Rapist extends BadGuys{}
class Robber extends BadGuys{}
class Doctor extends GoodGuys{}
class Teacher extends GoodGuys{}
class Police extends GoodGuys{}

/*����ʵ���˲�ͬһ�������Iterable�ӿڷ��������ڱ�������
ʹ����������������Ҫ��ѭ���̶�������������*/

public class StoryCharacterGenerator implements Generator<StoryCharacter>,Iterable<StoryCharacter>{
	private Class[] types= {GoodGuys.class,BadGuys.class,Murderer.class,Rapist.class,Robber.class,Doctor.class,Teacher.class,Police.class};
	//	�����
	private static Random rand=new Random(47);
//	����������
	private int count;
//	�޲ι�����
	public StoryCharacterGenerator() {}
//	������������
	public StoryCharacterGenerator(int count) {
		this.count=count;
	}
	@Override
	public StoryCharacter next(){
		try {
		return (StoryCharacter)types[rand.nextInt(types.length)].newInstance();
		}catch(Exception e) {
			throw new RuntimeException();
		}
	}
	
	@Override
	public Iterator<StoryCharacter> iterator() {
		return new Iterator<StoryCharacter>(){
			int size=count;
			@Override
			public boolean hasNext() {
				return size>0;
			}

			@Override
			public StoryCharacter next() {
				size--;
				return StoryCharacterGenerator.this.next();
			}
		} ;
	}
	
	public static void main(String[] args) {
		StoryCharacterGenerator s=new StoryCharacterGenerator(5);
		for (StoryCharacter storyCharacter : s) {
			System.out.println(storyCharacter);
		}
	}
	/*
	 * foreach���
		for(tmp : ������)==
			while(!ʵ��Iterable�ӿڵĶ���.hasNext())
				tmp=�ö���.next();
	*/
}
