package test;

abstract class Machine {

	String name = "���";
	int age = 1990;
	
	
	public void play() {
		System.out.println(name + "�� ������ �Դϴ�.");
	}
	abstract void turnOff();
	abstract void turnOn();
	
}
