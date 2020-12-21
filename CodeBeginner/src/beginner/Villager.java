package beginner;

import java.util.Scanner;

public class Villager {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int powAbove = 0;
		int powBelow = 0;
		Integer villages =  Integer.parseInt(scanner.nextLine());
		System.out.println(" villages  " +villages);
		String river = scanner.nextLine();
		int index = river.indexOf(" ");
		System.out.println("index "+index);
		Integer m = Integer.parseInt(river.substring(0, index));
		Integer c= Integer.parseInt(river.substring(index+1));
		System.out.println("m "+m+" c "+c );
		for(int i=0;i<villages;i++){
			String line = scanner.nextLine();
			String[] village =  line.split(" ");
			Integer x = Integer.parseInt(village[0]);
			Integer y = Integer.parseInt(village[1]);
			Integer pow = Integer.parseInt(village[2]);
			System.out.println("x "+x+" y "+y+" pow "+pow);
			if(y-m*x-c>0)
				powAbove = pow + powAbove;
			else
				powBelow = pow + powBelow;
		}
		
		System.out.println("powAbove "+powAbove);
		System.out.println("powBelow "+powBelow);
	}

}
