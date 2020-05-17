package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �򵥹���ģʽ��
 * �ŵ㣺������Pizza�ķ���ͳһ���빤���ڣ�������ֻ��Ҫ�����������ͣ�����Ҫ������δ�����
 * 		����д�ĺô��ǣ��������һ���������ͣ�����Ҫ�������޸ģ�ֻ��Ҫ�ڹ��������ڲ�������Ӧ�����ʹ��뼴�ɡ�
 */
public class OrderPizza1 {

	//����һ���򵥹�������
	private SimpleFactory simpleFactory;
	private Pizza pizza = null;

	//������
	public OrderPizza1(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = ""; //�û������

		this.simpleFactory = simpleFactory; //���ü򵥹�������
		
		do {
			orderType = getType(); 
			pizza = this.simpleFactory.createPizza(orderType);
			
			//���pizza
			if(pizza != null) { //�����ɹ�
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println(" ��������ʧ�� ");
				break;
			}
		}while(true);
	}
	
	// дһ�����������Ի�ȡ�ͻ�ϣ����������������
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza ����:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
