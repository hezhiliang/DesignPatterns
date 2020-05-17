package com.atguigu.factory.simplefactory.pizzastore.order;

//相当于一个客户端，发出订购
public class PizzaStore {

	public static void main(String[] args) {
		//方法一：传统方式
		//new OrderPizza();
		
		//方法二：使用简单工厂模式
		new OrderPizza1(new SimpleFactory());
		System.out.println("~~退出程序~~");

		//方法三：使用静态工厂模式
//		new OrderPizza2();
	}

}
