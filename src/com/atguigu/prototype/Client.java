package com.atguigu.prototype;

/**
 * ��¡������
 * ������һֻ��tom�� ����Ϊ: tom, ����Ϊ�� 1�� ��ɫΪ����ɫ�����д���򴴽���tom
 * �� ������ȫ��ͬ��10ֻ��
 * <p>
 * ��ͳ�ķ�ʽ����ȱ��
 * 1) �ŵ��ǱȽϺ���⣬���ײ�����
 * 2) �ڴ����µĶ���ʱ�� ������Ҫ���»�ȡԭʼ��������ԣ���������Ķ���Ƚϸ���ʱ��Ч�ʽϵ�
 * 3) ������Ҫ���³�ʼ�����󣬶����Ƕ�̬�ػ�ö�������ʱ��״̬, �������
 * 4) �Ľ���˼·����
 * ˼·�� Java��Object����������ĸ��࣬ Object���ṩ��һ��clone()�������÷�������
 * ��һ��Java������һ�ݣ�������Ҫʵ��clone��Java�����Ҫʵ��һ���ӿ�Cloneable��
 * �ýӿڱ�ʾ�����ܹ������Ҿ��и��Ƶ����� => ԭ��ģʽ
 */
public class Client {

    public static void main(String[] args) {
        //��ͳ�ķ���
        Sheep sheep = new Sheep("tom", 1, "��ɫ");

        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        //....

        System.out.println(sheep);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        //...
    }

}
