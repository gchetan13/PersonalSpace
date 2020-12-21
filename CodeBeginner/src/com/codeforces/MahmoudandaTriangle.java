package com.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class MahmoudandaTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] lines = new int[n];
		String[] l = scanner.nextLine().split(" ");
		for (int i = 0; i < l.length; i++) {
			lines[i] = Integer.parseInt(l[i]);
		}
		boolean isdegenrate = false;
		Arrays.sort(lines);
		for (int i = 0; i < lines.length - 2; i++) {
			for (int k = lines.length - 1; i < k - 1; k--) {
				if ((lines[i] + lines[k] >= lines[k - 1])
						&& (lines[i] + lines[k - 1] >= lines[k])
						&& (lines[k] + lines[k - 1] >= lines[i])) {
					isdegenrate = true;
					break;
				}
			}
			if(isdegenrate)
				break;
		}
		if (isdegenrate)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
