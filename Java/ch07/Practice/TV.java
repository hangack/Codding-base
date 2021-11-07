package Practice;

public class TV {
	String company;
	int y, inch;
	TV(String company, int y, int inch){
		this.company = company; this.y = y; this.inch = inch;
	}
	void show() {
	System.out.printf("%s에서 만든 %d년형 %d인치 TV",company,y,inch);
	}
}
