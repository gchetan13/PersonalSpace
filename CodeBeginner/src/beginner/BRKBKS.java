package beginner;

import java.util.Scanner;

public class BRKBKS {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int test = Integer.parseInt(scanner.nextLine());
		System.out.println(test);
		int s=0;
		int w1=0;
		int w2=0;
		int w3=0;
		for (int i = 0; i < test; i++) {
			String line = scanner.nextLine();
			String[] linesplit=line.split(" ");
			s=Integer.parseInt(linesplit[0]);
			w1=Integer.parseInt(linesplit[1]);
			w2=Integer.parseInt(linesplit[2]);
			w3=Integer.parseInt(linesplit[3]);
			if(s>=w1+w2+w3)
				System.out.println(1);
			else if( (s>=w1+w2 || s>=w2+w3 ) && (s<w1+w2+w3)) 
				System.out.println(2);
			else
				System.out.println(3);
		}
	}
}
