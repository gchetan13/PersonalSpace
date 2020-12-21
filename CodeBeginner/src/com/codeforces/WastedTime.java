package com.codeforces;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WastedTime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] s1 =  scanner.nextLine().split(" ");
		int points = Integer.parseInt(s1[0]);
		String[] prevpoint = scanner.nextLine().split(" ");
		String[] nextpoint = scanner.nextLine().split(" ");
		double distance=0;
		if(2==points){
			distance = distance + Math.sqrt(
					Math.pow((Integer.parseInt(prevpoint[0])-Integer.parseInt(nextpoint[0])), 2)
					+Math.pow((Integer.parseInt(prevpoint[1])-Integer.parseInt(nextpoint[1])), 2));
			prevpoint = nextpoint;
		}
		else{
			for (int i = 0; i < points-1; i++) {
				distance = distance + Math.sqrt(
						Math.pow((Integer.parseInt(prevpoint[0])-Integer.parseInt(nextpoint[0])), 2)
						+Math.pow((Integer.parseInt(prevpoint[1])-Integer.parseInt(nextpoint[1])), 2));
				prevpoint = nextpoint;
				if(i<points-2)
				nextpoint = scanner.nextLine().split(" ");
			}

		}
		double time = distance*Integer.parseInt(s1[1])/50;
		DecimalFormat format = new DecimalFormat("#.######");
		System.out.println(format.format(time));
		
	}

}
