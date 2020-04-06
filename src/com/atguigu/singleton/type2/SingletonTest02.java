package com.atguigu.singleton.type2;

public class SingletonTest02 {

	public static void main(String[] args) {
		//����
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
	}

}

//����ʽ(��̬�����)
/*��ȱ��˵����
		1) ���ַ�ʽ������ķ�ʽ��ʵ���ƣ�ֻ��������ʵ�����Ĺ��̷����˾�̬������У�
		Ҳ������װ�ص�ʱ�򣬾�ִ�о�̬������еĴ��룬��ʼ�����ʵ������ȱ���������һ���ġ�

		2) ���ۣ� ���ֵ���ģʽ���ã����ǿ�������ڴ��˷�*/
class Singleton {
	
	//1. ������˽�л�, �ⲿ��new
	private Singleton() {
		
	}
	

	//2.�����ڲ���������ʵ��
	private  static Singleton instance;
	
	static { // �ھ�̬������У�������������
		instance = new Singleton();
	}
	
	//3. �ṩһ�����еľ�̬����������ʵ������
	public static Singleton getInstance() {
		return instance;
	}
	
}