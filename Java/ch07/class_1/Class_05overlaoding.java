package class_1;

public class Class_05overlaoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc05 car1 = new Calc05();
		System.out.println("car1.company: "+car1.company);
		System.out.println("car1.model: "+car1.model);
		System.out.println("car1.color: "+car1.color);
		System.out.println("car1.maxSpeed: "+car1.maxSpeed);
		System.out.println();

		Calc05 car2 = new Calc05("산타패");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.model: "+car2.model);
		System.out.println();

		Calc05 car3 = new Calc05("야반때","white");
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.model: "+car3.model);
		System.out.println("car3.color: "+car3.color);
		System.out.println();

		Calc05 car4 = new Calc05("쟤네실수","black",3000);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car4.model: "+car4.model);
		System.out.println("car4.color: "+car4.color);
		System.out.println("car4.maxSpeed: "+car4.maxSpeed);
		System.out.println();

	}

}
