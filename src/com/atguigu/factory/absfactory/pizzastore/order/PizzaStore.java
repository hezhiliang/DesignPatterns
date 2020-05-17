package com.atguigu.factory.absfactory.pizzastore.order;

public class PizzaStore {

	public static void main(String[] args) {
		//使用北京工厂订购披萨
		new OrderPizza(new BJFactory());

		//使用伦敦工厂订购披萨
		new OrderPizza(new LDFactory());
	}

}
