package com.atguigu.factory.absfactory.pizzastore.order;

public class PizzaStore {

	public static void main(String[] args) {
		//ʹ�ñ���������������
		new OrderPizza(new BJFactory());

		//ʹ���׶ع�����������
		new OrderPizza(new LDFactory());
	}

}
