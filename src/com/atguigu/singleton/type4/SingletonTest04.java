package com.atguigu.singleton.type4;


public class SingletonTest04 {

	public static void main(String[] args) {
		System.out.println("����ʽ2 �� �̰߳�ȫ~");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

// ����ʽ(�̰߳�ȫ��ͬ������)
/*��ȱ��˵����
		1) ������̲߳���ȫ����

		2) Ч��̫���ˣ�ÿ���߳����������ʵ��ʱ��ִ��getInstance()������Ҫ����ͬ����
		����ʵ�������ִֻ��һ��ʵ��������͹��ˣ���������ø���ʵ����ֱ��return�����ˡ���������ͬ��Ч��̫��

		3) ���ۣ� ��ʵ�ʿ����У� ���Ƽ�ʹ�����ַ�ʽ*/
class Singleton {
	private static Singleton instance;
	
	private Singleton() {}
	
	//�ṩһ����̬�Ĺ��з���������ͬ������Ĵ��룬����̰߳�ȫ����
	//������ʽ
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}