package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���󹤳�ģʽ
 * ��������
 * 1) ���󹤳�ģʽ��������һ��interface���ڴ�����ػ���������ϵ�Ķ���أ�������ָ���������
 * 2) ���󹤳�ģʽ���Խ��򵥹���ģʽ�͹�������ģʽ�������ϡ�
 * 3) ����Ʋ��濴�����󹤳�ģʽ���ǶԼ򵥹���ģʽ�ĸĽ�(���߳�Ϊ��һ���ĳ���)��
 * 4) ��������������㣬 AbsFactory(���󹤳�) �� ����ʵ�ֵĹ������ࡣ����Ա����
 * ���ݴ�����������ʹ�ö�Ӧ�Ĺ������ࡣ �����������ļ򵥹��������˹�����(cu)�������ڴ����ά������չ��
 * ���ŵ㡿��1���������ڸ��ӵĳ��������ϵʹ��������ڲ���һϵ�в�Ʒ��Ĺ���ܷ���
 * ��ȱ�㡿��1����չ�ܷ�����ÿ��Ҫ�޸ĺܶ��ࡣ
 * ��Ӧ�ó��������������Ķ�����һϵ���໥�������໥�����Ĳ�Ʒ��ʱʹ��
 */
public class OrderPizza {
    //���󹤳�����
    AbsFactory factory;

    // ������
    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = ""; // �û�����
        this.factory = factory;
        do {
            orderType = getType();
            // factory �����Ǳ����Ĺ������࣬Ҳ�������׶صĹ�������
            pizza = factory.createPizza(orderType);
            if (pizza != null) { // ����ok
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("����ʧ��");
                break;
            }
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
