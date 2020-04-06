package com.atguigu.singleton.type6;


public class SingletonTest06 {

	public static void main(String[] args) {
		System.out.println("˫�ؼ��");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance == instance2); // true
		System.out.println("instance.hashCode=" + instance.hashCode());
		System.out.println("instance2.hashCode=" + instance2.hashCode());
		
	}

}

// ����ʽ(�̰߳�ȫ��˫�ؼ��)
/*��ȱ��˵����
		1) Double-Check�����Ƕ��߳̿����г�ʹ�õ��ģ� ���������ʾ�����ǽ���������if (singleton == null)��飬�����Ϳ��Ա�֤�̰߳�ȫ�ˡ�

		2) ������ʵ��������ֻ��ִ��һ�Σ������ٴη���ʱ���ж�if (singleton == null)��ֱ��returnʵ��������Ҳ����ķ������з���ͬ��.

		3) �̰߳�ȫ���ӳټ��أ�Ч�ʽϸ�

		4) ���ۣ���ʵ�ʿ����У��Ƽ�ʹ�����ֵ������ģʽ*/
class Singleton {
	//volatile�������Ϊ��������synchronized�������ǣ����޸�ֵ�������µ������С�
	private static volatile Singleton instance;
	
	private Singleton() {}
	
	//�ṩһ����̬�Ĺ��з���������˫�ؼ����룬����̰߳�ȫ����, ͬʱ�������������
	//ͬʱ��֤��Ч��, �Ƽ�ʹ��
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized (Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
			
		}
		return instance;
	}
}