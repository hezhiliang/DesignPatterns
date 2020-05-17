package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ��һ�����������
 * ��һ����������Ŀ��Ҫ���������������չ��Ҫ����ά��
 * 1) ����������ܶ�(���� GreekPizz�� CheesePizz ��)
 * 2) ������������ prepare�� bake, cut, box
 * 3) ��������궩������
 * <p>
 *
 * ��ͳ��ʽ
 * �ŵ㣺�����뵽
 * ȱ�㣺ȱ����Υ�������ģʽ��ocpԭ�򣬼�����չ���ţ����޸Ĺرա��������Ǹ��������¹��ܵ�ʱ�򣬾������޸Ĵ��룬���߾��������޸Ĵ���
 */
public class OrderPizza {

    // ������
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // ��������������
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName(" ϣ������ ");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName(" �������� ");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("��������");
            } else {
                break;
            }
            //���pizza ��������
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

        } while (true);
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
