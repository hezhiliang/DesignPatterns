package com.atguigu.factory;

import java.util.Calendar;

/**
 * @author hzl
 * @description 工厂模式在JDK-Calendar的应用
 * @create 2020-05-17-19:43
 */
public class CalendarTest {
    public static void main(String[] args) {
        //getInstance 是 Calendar 的静态方法
        Calendar cal = Calendar.getInstance();

        System.out.println("年：" + cal.get(Calendar.YEAR));
        //注意取月份小标从0开始，所以需要+1
        System.out.println("月：" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日：" + cal.get(Calendar.DATE));
        System.out.println("时：" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分：" + cal.get(Calendar.MINUTE));
        System.out.println("秒：" + cal.get(Calendar.SECOND));

    }
}
