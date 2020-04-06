package com.atguigu.singleton.type3;


public class SingletonTest03 {

    public static void main(String[] args) {
        System.out.println("����ʽ1 �� �̲߳���ȫ~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}
//	����ʽ(�̲߳���ȫ)
/*��ȱ��˵����
        1) ����Lazy Loading��Ч��������ֻ���ڵ��߳���ʹ�á�

        2) ����ڶ��߳��£�һ���߳̽�����if (singleton == null)�ж����飬��δ���ü�����ִ�У�
        ��һ���߳�Ҳͨ��������ж���䣬��ʱ���������ʵ���������ڶ��̻߳����²���ʹ�����ַ�ʽ

        3) ���ۣ���ʵ�ʿ����У���Ҫʹ�����ַ�ʽ*/
class Singleton {
    //1. �ڲ���������ʵ��
    private static Singleton instance;

    //2. ˽�л����������ⲿ��new
    private Singleton() {
    }

    //3. �ṩһ����̬�Ĺ��з�������ʹ�õ��÷���ʱ����ȥ���� instance,������ʽ
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}