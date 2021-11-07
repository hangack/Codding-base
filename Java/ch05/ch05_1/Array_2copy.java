package ch05_1;

import java.util.Arrays;

public class Array_2copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oldArray[] = {1,2,3};
		int newArray[] = new int[5];
		
		for(int i=0;i<oldArray.length;i++) {
			newArray[i] = oldArray[i];
		}
		System.out.println("새로운 배열 값: ");
		for(int i=0;i<newArray.length;i++) {
			System.out.print(newArray[i]+" ");
		}System.out.println();
		
		
		oldArray = new int[]{1,2,3};
//		newArray = new int[5];
		Arrays.fill(newArray, 0);
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		System.out.println("새로운 배열 값: ");
		for(int i=0;i<newArray.length;i++) {
			System.out.print(newArray[i]+" ");
		}System.out.println();


//		newArray = new int[5];
		Arrays.fill(newArray, 0);
		System.arraycopy(oldArray, 1, newArray, 1, oldArray.length-1);
		System.out.println("새로운 배열 값: ");
		for(int i=0;i<newArray.length;i++) {
			System.out.print(newArray[i]+" ");
		}System.out.println();

		
		
		
		
	}
}
