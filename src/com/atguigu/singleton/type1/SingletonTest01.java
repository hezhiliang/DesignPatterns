package com.atguigu.singleton.type1;

public class SingletonTest01 {

    public static void main(String[] args) {
        //����
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

//����ʽ(��̬����)
/*��ȱ��˵����
		1) �ŵ㣺����д���Ƚϼ򵥣���������װ�ص�ʱ������ʵ�������������߳�ͬ
		�����⡣

		2) ȱ�㣺����װ�ص�ʱ������ʵ������û�дﵽLazy Loading��Ч���������ʼ
		���մ�δʹ�ù����ʵ�����������ڴ���˷�

		3) ���ַ�ʽ����classloder���Ʊ����˶��̵߳�ͬ�����⣬������ instance����װ��
		ʱ��ʵ�������ڵ���ģʽ�д�������ǵ���getInstance������ ���ǵ�����װ��
		��ԭ���кܶ��֣� ��˲���ȷ���������ķ�ʽ�����������ľ�̬������������
		װ�أ���ʱ���ʼ��instance��û�дﵽlazy loading��Ч��

		4) ���ۣ����ֵ���ģʽ���ã� ��������ڴ��˷�*/
class Singleton {

    //1. ������˽�л�, �ⲿ��new
    private Singleton() {

    }

    //2.�����ڲ���������ʵ��
    private final static Singleton instance = new Singleton();

    //3. �ṩһ�����еľ�̬����������ʵ������
    public static Singleton getInstance() {
        return instance;
    }

}