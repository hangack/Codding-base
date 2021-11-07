package Practice;

public class Car04 {
	int a,b,c,d;
	Tire	fL = new Tire("전방좌측",a),
			fR = new Tire("전방우측",b),
			bL = new Tire("후방좌측",c),
			bR = new Tire("후방우측",d);
	
	String run() {
		
		return "stop";
	}

}
