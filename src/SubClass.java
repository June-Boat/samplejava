/**
 * ���ھ�̬��ʼ���顢�����ʼ���顢���캯���ڵ��༰�������ִ�����ȼ�ʵ�飬
 */

/**
 * @author June-Boat
 *
 */
class Parent {
        /* ��̬���� */
    public static String p_StaticField = "����--��̬����";
         /* ���� */
    public String    p_Field = "����--����";
    protected int    i    = 9;
    protected int    j    = 0;
        /* ��̬��ʼ���� */
    static {
        System.out.println( p_StaticField );
        System.out.println( "����--��̬��ʼ����" );
    }
        /* ��ʼ���� */
    {
        System.out.println( p_Field );
        System.out.println( "����--��ʼ����" );
    }
        /* ������ */
    public Parent()//����
    {
        System.out.println( "����--������" );
        System.out.println( "i=" + i + ", j=" + j );
        j = 20;
    }
}

public class SubClass extends Parent {
         /* ��̬���� */
    public static String s_StaticField = "����--��̬����";
         /* ���� */
    public String s_Field = "����--����";
    
    
        /* ��̬��ʼ���� */
    static {
        System.out.println( s_StaticField );
        System.out.println( "����--��̬��ʼ����" );
    }
       /* ��ʼ���� */
    {
        System.out.println( s_Field );
        System.out.println( "����--��ʼ����" );
    }
       /* ������ */
    public SubClass()
    {
        System.out.println( "����--������" );
        System.out.println( "i=" + i + ",j=" + j);
    }


        /* ������� */
    public static void main( String[] args )
    {
        System.out.println( "����main����" );
        new SubClass();
    }
}