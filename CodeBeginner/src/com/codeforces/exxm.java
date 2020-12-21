package com.codeforces;

public class exxm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "chetehc";
		int k=1;
		int n=2;
		//System.out.println(s.substring(0,1));
		 for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)!=s.charAt(j+1)){
					s=s.substring(j+1)+s.charAt(j);
					break;
				}
			}
		 System.out.println(s);
	}

}
