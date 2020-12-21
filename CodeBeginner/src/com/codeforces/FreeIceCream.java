package com.codeforces;

import java.util.Scanner;

public class FreeIceCream {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String sn;
		String[] a= s1.split(" ");
		int distress =0;
		int numTest = Integer.parseInt(a[0]);
		long NoIcecream = Long.parseLong(a[1]);
		for (int i = 0; i < numTest; i++) {
		    sn = scanner.nextLine();
		    String[] q = sn.split(" ");
		    if(q[0].equals("+")){
		    	NoIcecream=NoIcecream+Integer.parseInt(q[1]);
		    }
		    else if(q[0].equals("-")){
		    	if(NoIcecream>=Integer.parseInt(q[1]))
		    		NoIcecream = NoIcecream-Integer.parseInt(q[1]);
		    	else
		    	distress++;
		    }
		}
		System.out.println(NoIcecream+" "+distress);
	}

}
