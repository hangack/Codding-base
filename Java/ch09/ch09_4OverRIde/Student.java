package ch09_4OverRIde;

public class Student extends Person {
	void Student() {
		age = 1;
		name = "asd";
		height = 123;
		setWeight(45);
		System.out.println(age+" "+name+" "+height+" "+getWeight());
	}

}
