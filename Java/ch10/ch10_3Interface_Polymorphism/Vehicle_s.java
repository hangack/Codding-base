package ch10_3Interface_Polymorphism;

public class Vehicle_s {}

class Bus implements Vehicle{
	@Override
	public void run(){
		System.out.println("달린다 버스");
	}
}
class Taxi implements Vehicle{
	@Override
	public void run(){
		System.out.println("달린다 택시");
	}
}
