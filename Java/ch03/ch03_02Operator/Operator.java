package ch03_02Operator;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5, b = 3;
		System.out.println("a+b: " + (a + b));
		System.out.println("a-b: " + (a - b));
		System.out.println("a*b: " + (a * b));
		System.out.println("a/b: " + (a / b));
		System.out.println("a%b: " + (a % b));
		

		System.out.println();
		
		int num1=5;
		System.out.println(++num1);
		System.out.println(++num1);
		System.out.println(num1);
		int num2=5;
		System.out.println(num2++);
		System.out.println(num2++);
		System.out.println(num2);
		int num3=5;
		System.out.println(--num3);
		System.out.println(--num3);
		System.out.println(num3);
		int num4=5;
		System.out.println(num4--);
		System.out.println(num4--);
		System.out.println(num4);
		

		System.out.println();
		
		int x=10,y=20, z=x+y;
		System.out.println("10+20 = "+z);
		
		
		System.out.println();
		
		int a1=7;
		a1 = a1+10;
		System.out.println("a: "+a1);
		int b1=7;
		b1+=10;
		System.out.println("b: "+b1);
		a=10;
		System.out.println("a+=5: "+(a+=5));
		System.out.println("a-=7: "+(a-=7));
		System.out.println("a*=5: "+(a*=5));
		System.out.println("a/=4: "+(a/=4));
		System.out.println("a%=5: "+(a%=5));
		

		System.out.println();
		
		a = 3; b = 5;
		System.out.println("a<b:"+(a<b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a>=b:"+(a>=b));
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		
		
		//	삼항 연산자	(논리)? 참일경우 : 거짓일경우;
		
		int c;
		c = (a>b)?100:5000;
		System.out.printf("c: %d\n",c);
		

		System.out.println();
		
		num1 = 0; num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0)&&((num2 += 10) > 0);	// f&&t=F
		System.out.println("result= "+result);
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);		//and(&&)이기에 첫 값이 f면 무조건 f라 이후 연산은 진행하지 않음
		System.out.println();
		
		num1 = 0; num2 = 0;
		result = ((num1 += 10) < 0)&((num2 += 10) > 0); // 부호를 1개만 넣을 경우 이후 연산도 진행한다.
		System.out.println("result= "+result);
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);
		System.out.println();

		num1 = 0; num2 = 0;
		result = ((num1 += 10) > 0)||((num2 += 10) < 0);	// f||t=F
		System.out.println("result= "+result);
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);		//or(||)이기에 첫 값이 f면 무조건 f라 이후 연산은 진행하지 않음
		System.out.println();

		num1 = 0; num2 = 0;
		result = ((num1 += 10) > 0)|((num2 += 10) < 0);	// 부호를 1개만 넣을 경우 이후 연산도 진행한다.
		System.out.println("result= "+result);
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);
		System.out.println();

		num1 = 0;
		result = !((num1 += 10) > 0);	// !t = f
		System.out.println("result= "+result);
		System.out.println("num1= "+num1);
		System.out.println();
		
		num1 = 0; num2 = 0;
		result = ((num1 += 10) > 0)^((num2 -= 10) < 0);	// t^t = f
		System.out.println("result= "+result);
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);
		System.out.println();
		
		
	}

}
