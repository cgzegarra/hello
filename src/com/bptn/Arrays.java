package com.bptn;

public class Arrays {

	public static void main(String[] args) {

		int a0 = 0;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int a7 = 0;
		int a8 = 0;
		int a9 = 0;

		String[] b = {"Hello", "Bptn"};

		int[] a = { 3,5,6,7,3,2,5,6,8,9 };
	//              0 1 2 3 4 5 6 7 8 9
		
		a[a.length-1] = 12;
		
		String str = null;
		
		//System.out.println(str);
		
		String[] c = new String[10];
		
		c[0]= "Hello";
				
		for(String num: c) {
			System.out.println(num);
		}
		
		
		for(int i=0;i<11;i++) {
			
			if (i==4) {
				// break;
			}
			System.out.println(a[i]);			
		}
		
		// Enhanced for-loop
		
		/*for(int num: a) {
			System.out.println(num);						
		}*/
		
		
	
	}

}
