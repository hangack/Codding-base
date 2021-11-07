package Practice;

public class Circle {
	final double pi = 3.141592;
	int r;
	double area;
	
	void Cira() {
		area = (Math.pow(r, 2)*pi);
		System.out.printf("반지름: %d\t넓이: %2d\n",r,(int)area);
	}

}
