package com.atguigu.uml.composition;

public class Computer {
	private Mouse mouse = new Mouse(); //�����Ժ�computer���ܷ���
	private Monitor monitor = new Monitor();//��ʾ�����Ժ�Computer���ܷ���
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
}
