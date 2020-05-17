package com.atguigu.factory;

import java.util.Calendar;

/**
 * @author hzl
 * @description ����ģʽ��JDK-Calendar��Ӧ��
 * @create 2020-05-17-19:43
 */
public class CalendarTest {
    public static void main(String[] args) {
        //getInstance �� Calendar �ľ�̬����
        Calendar cal = Calendar.getInstance();

        System.out.println("�꣺" + cal.get(Calendar.YEAR));
        //ע��ȡ�·�С���0��ʼ��������Ҫ+1
        System.out.println("�£�" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("�գ�" + cal.get(Calendar.DATE));
        System.out.println("ʱ��" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("�֣�" + cal.get(Calendar.MINUTE));
        System.out.println("�룺" + cal.get(Calendar.SECOND));

    }
}
