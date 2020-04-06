package com.atguigu.singleton.type7;


public class SingletonTest07 {

	public static void main(String[] args) {
		System.out.println("ʹ�þ�̬�ڲ�����ɵ���ģʽ");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());

	}

}

// ��̬�ڲ�����ɣ� �Ƽ�ʹ��
/*��ȱ��˵����
		1) ���ַ�ʽ��������װ�صĻ�������֤��ʼ��ʵ��ʱֻ��һ���̡߳�

		2) ��̬�ڲ��෽ʽ��Singleton�౻װ��ʱ����������ʵ��������������Ҫʵ����ʱ������getInstance������
		�Ż�װ��SingletonInstance�࣬�Ӷ����Singleton��ʵ������

		3) ��ľ�̬����ֻ���ڵ�һ�μ������ʱ���ʼ������������� JVM�������Ǳ�֤���̵߳İ�ȫ�ԣ�������г�ʼ��ʱ������߳����޷�����ġ�

		4) �ŵ㣺�������̲߳���ȫ�����þ�̬�ڲ����ص�ʵ���ӳټ��أ�Ч�ʸ�

		5) ���ۣ��Ƽ�ʹ��.*/
class Singleton {
	//������˽�л�
	private Singleton() {}
	
	//дһ����̬�ڲ���,��������һ����̬���� Singleton
	//��̬�ڲ��࣬������ص�ʱ�򲻻��ʼ����ֻ��ʹ�õ������ʱ��Ż��ʼ�����������ҽ����ʼ��һ�Ρ���������+ ��ʼ����
	private static class SingletonInstance {
		private static final Singleton INSTANCE = new Singleton(); 
	}
	
	//�ṩһ����̬�Ĺ��з�����ֱ�ӷ���SingletonInstance.INSTANCE
	public static  Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
}