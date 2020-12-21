package com.csc.clone.Test;


public class Test {
	
	
	public static void main(String[] args) {
/*		Address address = new Address("Indore");
		Address address1 = new Address("Bhopal");
		Map<Address, String> order = new HashMap<Address, String>();
		
		new AbstractMap<String, String>();
		Map<String, map> map = new HashMap<String, map>();
		map.put(order, "Chea");
		
		order.put(address, "B");
		order.put(address1, "A");
		System.out.println(order);*/
		
		int[] age = {2, 0, 1, 1, 2, 3, 1, 5, 5, 5, 1};
		int[] exparr = {2, 1, 2, 1, 2, 3, 1, 2, 1, 2, 1};
		
		System.out.println();
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i]+" ");
		}
		System.out.println();
		System.out.println();
		int banana[] = new int[age.length];
		for (int i = 0; i < banana.length; i++) {
				banana[i]=1;
			System.out.print(banana[i]+" ");
		}
		System.out.println();
		System.out.print(0+" ");
		for (int i = 1; i < age.length-1; i++) {
				if(age[i]>age[i-1] || age[i]>age[i+1])
					banana[i]=2;
			System.out.print(banana[i]+" ");
		}
		System.out.print(0);
		
		System.out.println();
		
		System.out.print(0+" ");
		for (int i = 1; i < age.length-1; i++) {
			if(age[i]>age[i-1] || age[i]>age[i+1])
				if(banana[i-1]>=banana[i] || banana[i+1]>=banana[i])
				banana[i]=banana[i-1]+1;
		System.out.print(banana[i]+" ");
		}
		System.out.print(0);

		if(age[0]>age[1]){
			banana[0]=banana[1]+1;
		}else{
			banana[0]=1;
		}if(age[age.length-1]>age[age.length-2]){
			banana[banana.length-1]=banana[banana.length-2]+1;
		}else{
			banana[banana.length-1]=1;
		}
		System.out.println();
		for (int i = 0; i < banana.length; i++) {
			System.out.print(banana[i]+" ");
		}
		
			System.out.println();
		for (int i = 0; i < exparr.length; i++) {
			System.out.print(exparr[i]+" ");
		}
		
	}
}
