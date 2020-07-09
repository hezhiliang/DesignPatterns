package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 抽象工厂模式
 * 基本介绍
 * 1) 抽象工厂模式：定义了一个interface用于创建相关或有依赖关系的对象簇，而无需指明具体的类
 * 2) 抽象工厂模式可以将简单工厂模式和工厂方法模式进行整合。
 * 3) 从设计层面看，抽象工厂模式就是对简单工厂模式的改进(或者称为进一步的抽象)。
 * 4) 将工厂抽象成两层， AbsFactory(抽象工厂) 和 具体实现的工厂子类。程序员可以
 * 根据创建对象类型使用对应的工厂子类。 这样将单个的简单工厂类变成了工厂簇(cu)，更利于代码的维护和扩展。
 * 【优点】：1、正是由于复杂的抽象关联关系使得在类的内部对一系列产品组的管理很方便
 * 【缺点】：1、扩展很费力，每次要修改很多类。
 * 【应用场景】：待创建的对象是一系列相互关联或相互依赖的产品族时使用
 */
public class OrderPizza {
    //抽象工厂对象
    AbsFactory factory;

    // 构造器
    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory) {
        Pizza pizza = null;
        String orderType = ""; // 用户输入
        this.factory = factory;
        do {
            orderType = getType();
            // factory 可能是北京的工厂子类，也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);
            if (pizza != null) { // 订购ok
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
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
