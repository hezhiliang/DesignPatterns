package com.atguigu.singleton.type8;

public class SingletonTest08 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance == instance2);
		
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		
		instance.sayOK();
	}
}

//ʹ��ö�٣�����ʵ�ֵ���, �Ƽ�
/*��ȱ��˵����
		1) �����JDK1.5����ӵ�ö����ʵ�ֵ���ģʽ�������ܱ�����߳�ͬ�����⣬���һ��ܷ�ֹ�����л����´����µĶ���

		2) ���ַ�ʽ��Effective Java����Josh Bloch �ᳫ�ķ�ʽ

		3) ���ۣ��Ƽ�ʹ��*/
enum Singleton {
	INSTANCE; //����
	public void sayOK() {
		System.out.println("ok~");
	}
}