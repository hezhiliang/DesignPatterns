package com.atguigu.factory.simplefactory.pizzastore.order;

//�൱��һ���ͻ��ˣ���������
public class PizzaStore {

	public static void main(String[] args) {
		//����һ����ͳ��ʽ
		//new OrderPizza();
		
		//��������ʹ�ü򵥹���ģʽ
		new OrderPizza1(new SimpleFactory());
		System.out.println("~~�˳�����~~");

		//��������ʹ�þ�̬����ģʽ
//		new OrderPizza2();
	}

}
