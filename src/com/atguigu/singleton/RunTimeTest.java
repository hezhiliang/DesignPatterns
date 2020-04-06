package com.atguigu.singleton;

/**
 * @author hzl
 * @description ����ģʽ��JDK Ӧ�õ�Դ�����
 * 1) ����JDK�У� java.lang.Runtime���Ǿ���ĵ���ģʽ(����ʽ)
 * 2) �������+DebugԴ��+����˵��
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
