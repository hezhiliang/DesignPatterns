package com.atguigu.prototype.improve;

/**
 * ԭ��ģʽ����¡�Ķ���Ĭ����"ǳ����"����¡�Ķ���hashCode����ȡ�
 * <p>
 * ��������-ǳ���������
 * ǳ�����Ľ���
 * 1) �������������ǻ����������͵ĳ�Ա������ǳ������ֱ�ӽ���ֵ���ݣ�Ҳ���ǽ�������ֵ����һ�ݸ��µĶ���
 * 2) �������������������������͵ĳ�Ա����������˵��Ա������ĳ�����顢ĳ����
 * �Ķ���ȣ���ôǳ������������ô��ݣ�Ҳ����ֻ�ǽ��ó�Ա����������ֵ����
 * ���ַ������һ�ݸ��µĶ�����Ϊʵ������������ĸó�Ա������ָ��ͬһ��
 * ʵ��������������£���һ���������޸ĸó�Ա������Ӱ�쵽��һ������ĸó�Ա����ֵ��
 * 3) ǰ�����ǿ�¡�����ǳ������
 * 4) ǳ������ʹ��Ĭ�ϵ� clone()������ʵ�֡�
 * sheep = (Sheep) super.clone();
 * <p>
 * �����������
 * 1) ���ƶ�������л����������͵ĳ�Ա����ֵ
 * 2) Ϊ���������������͵ĳ�Ա��������洢�ռ䣬������ÿ�������������ͳ�Ա��
 * �������õĶ���ֱ���ö���ɴ�����ж���Ҳ����˵������������Ҫ������������п���
 * 3) ���ʵ�ַ�ʽ1����дclone������ʵ�����
 * 4) ���ʵ�ַ�ʽ2��ͨ���������л�ʵ�����(�Ƽ�)
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("ԭ��ģʽ��ɶ���Ĵ���");
        Sheep sheep = new Sheep("tom", 1, "��ɫ");

        sheep.friend = new Sheep("jack", 2, "��ɫ");

        Sheep sheep2 = (Sheep) sheep.clone(); //��¡
        Sheep sheep3 = (Sheep) sheep.clone(); //��¡
        Sheep sheep4 = (Sheep) sheep.clone(); //��¡
        Sheep sheep5 = (Sheep) sheep.clone(); //��¡

        System.out.println(sheep == sheep2); //false
        System.out.println("sheep��hashcode :" + sheep.hashCode());
        System.out.println("sheep2��hashcode :" + sheep2.hashCode());

        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
        System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
        System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());
    }

}
