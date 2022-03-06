package test;

abstract class Machine {

	String name = "기계";
	int age = 1990;
	
	
	public void play() {
		System.out.println(name + "를 실행중 입니다.");
	}
	abstract void turnOff();
	abstract void turnOn();
	
}
