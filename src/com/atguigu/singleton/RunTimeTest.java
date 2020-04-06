package com.atguigu.singleton;

/**
 * @author hzl
 * @description 单例模式在JDK 应用的源码分析
 * 1) 我们JDK中， java.lang.Runtime就是经典的单例模式(饿汉式)
 * 2) 代码分析+Debug源码+代码说明
 * @create 2020-04-06-7:22
 */
public class RunTimeTest {
    public static void main(String[] args) {
        Runtime runtime1 = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println(runtime1 == runtime2);
        System.out.println(runtime1.hashCode());
        System.out.println(runtime2.hashCode());
    }
}
