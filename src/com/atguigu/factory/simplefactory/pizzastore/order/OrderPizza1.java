package com.atguigu.factory.simplefactory.pizzastore.order;

import com.atguigu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 简单工厂模式：
 * 基本介绍
 * 1) 简单工厂模式是属于创建型模式，是工厂模式的一种。 简单工厂模式是由一
 * 个工厂对象决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族
 * 中最简单实用的模式
 * 2) 简单工厂模式：定义了一个创建对象的类，由这个类来封装实例化对象的行
 * 为(代码)
 * 3) 在软件开发中，当我们会用到大量的创建某种、某类或者某批对象时，就会使用到工厂模式
 * <p>
 * 【优点】：将创建Pizza的方法统一放入工厂内，调用者只需要传入披萨类型，不需要关心如何创建，
 * 这样写的好处是：如果新增一个披萨类型，不需要到处都修改，只需要在工厂方法内部新增对应的类型代码即可。
 * 【缺点】：1、实例化对象的逻辑全部封装在一个工厂类里，每次某个实例化对象的需求发生变化都要单独修改工厂类(违反了开闭原则),而且出了异常可能没法正常工作。
 *          2、不方便扩展子类
 * 【应用场景】：适合业务简单或者产品较少的情况
 */
public class OrderPizza1 {

    //定义一个简单工厂对象
    private SimpleFactory simpleFactory;
    private Pizza pizza = null;

    //构造器
    public OrderPizza1(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = ""; //用户输入的

        this.simpleFactory = simpleFactory; //设置简单工厂对象

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            //输出pizza
            if (pizza != null) { //订购成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println(" 订购披萨失败 ");
                break;
            }
        } while (true);
    }

    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
