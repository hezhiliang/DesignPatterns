package com.atguigu.prototype;

/**
 * @author hzl
 * @description 羊 对象
 * @return
 */
public class Sheep {
    //姓名
    private String name;
    //年龄
    private int age;
    //颜色
    private String color;

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color + "]";
    }


}
