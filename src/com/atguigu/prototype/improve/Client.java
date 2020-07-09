package com.atguigu.prototype.improve;

/**
 * 原型模式，克隆的对象默认是"浅拷贝"，克隆的对象hashCode不相等。
 * <p>
 * 深入讨论-浅拷贝和深拷贝
 * 浅拷贝的介绍
 * 1) 对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属性值复制一份给新的对象。
 * 2) 对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类
 * 的对象等，那么浅拷贝会进行引用传递，也就是只是将该成员变量的引用值（内
 * 存地址）复制一份给新的对象。因为实际上两个对象的该成员变量都指向同一个
 * 实例。在这种情况下，在一个对象中修改该成员变量会影响到另一个对象的该成员变量值。
 * 3) 前面我们克隆羊就是浅拷贝。
 * 4) 浅拷贝是使用默认的 clone()方法来实现。
 * sheep = (Sheep) super.clone();
 * <p>
 * 深拷贝基本介绍
 * 1) 复制对象的所有基本数据类型的成员变量值
 * 2) 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变
 * 量所引用的对象，直到该对象可达的所有对象。也就是说，对象进行深拷贝要对整个对象进行拷贝
 * 3) 深拷贝实现方式1：重写clone方法来实现深拷贝
 * 4) 深拷贝实现方式2：通过对象序列化实现深拷贝(推荐)
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");

        sheep.friend = new Sheep("jack", 2, "黑色");

        Sheep sheep2 = (Sheep) sheep.clone(); //克隆
        Sheep sheep3 = (Sheep) sheep.clone(); //克隆
        Sheep sheep4 = (Sheep) sheep.clone(); //克隆
        Sheep sheep5 = (Sheep) sheep.clone(); //克隆

        System.out.println(sheep == sheep2); //false
        System.out.println("sheep的hashcode :" + sheep.hashCode());
        System.out.println("sheep2的hashcode :" + sheep2.hashCode());

        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());
    }

}
