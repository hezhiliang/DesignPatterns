package com.atguigu.factory.factorymethod.pizzastore.order;

public class PizzaStore {

	public static void main(String[] args) {
		String loc = "bj";
		if (loc.equals("bj")) {
			//����������ζ�ĸ���Pizza
			new BJOrderPizzaFactory();
		} else {
			//�����׶ؿ�ζ�ĸ���Pizza
			new LDOrderPizzaFactory();
		}
	}

}
