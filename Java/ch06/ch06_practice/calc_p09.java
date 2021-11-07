package ch06_practice;

public class calc_p09 {
	
	char[] comma(char[] c) {
		char change[] = new char[c.length];
		for(int i=0;i<c.length;i++) {
			if(c[i] == ' ') change[i]=',';
			else change[i] = c[i];
		}
		return change;
	}

}
