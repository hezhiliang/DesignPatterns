package com.atguigu.singleton.type5;


public class SingletonTest05 {

    public static void main(String[] args) {
        System.out.println("����ʽ3 �� �̲߳���ȫ~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

// ����ʽ(�̲߳���ȫ��ͬ�������)
/*��ȱ��˵����
        1) ���ַ�ʽ����������Ե�����ʵ�ַ�ʽ�ĸĽ�����Ϊǰ��ͬ������Ч��̫�ͣ���Ϊͬ������ʵ�����ĵĴ����

        2) ��������ͬ�����������߳�ͬ�������á�����3��ʵ�ַ�ʽ����������һ�£�
        ����һ���߳̽�����if (singleton == null)�ж����飬��δ���ü�����ִ�У�
        ��һ���߳�Ҳͨ��������ж���䣬��ʱ���������ʵ����

        3) ���ۣ���ʵ�ʿ����У� ����ʹ�����ַ�ʽ*/
class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    //�ṩһ����̬�Ĺ��з���������ͬ������Ĵ��룬����̰߳�ȫ����
    //������ʽ
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}