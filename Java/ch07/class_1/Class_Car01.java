package class_1;

public class Class_Car01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car= new Car();
		System.out.printf("차량속도: %d\n",car.speed);
		System.out.printf("차량색상: %s\n",car.color);
		for(int i =0; i<5; i++) {
			car.forword();
		}
		System.out.printf("차량속도: %d\n",car.speed);

		Car car1 = new Car();
		Car car2 = new Car();

		System.out.printf("차량색상: %s\n",car1.color);
		System.out.printf("차량색상: %s\n",car2.color);
		
		System.out.println("============도색============");
		
		car1.color = "black";
		car2.color = "pink";
		System.out.printf("차량색상: %s\n",car1.color);
		System.out.printf("차량색상: %s\n",car2.color);
	}

}
