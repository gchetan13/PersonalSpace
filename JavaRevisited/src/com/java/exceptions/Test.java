package com.java.exceptions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		String s= "My  name is Chetan";
		
		StringTokenizer tokenizer =  new StringTokenizer(s);
		int count=0;
		/*while(tokenizer.hasMoreTokens()){
			System.out.println(tokenizer.nextToken());
			count++;
		}*/
	//	System.out.println("Number of words "+count);
		
		
		String s1="caracterisichse";
		char[] chars = s1.toCharArray();
		int countchar=1;
		char[] charcpy = s1.toCharArray();
		char[] onlyUnique = new char[s1.length()];
		
		Arrays.sort(chars);
		System.out.println(chars);
		for (int i = 0; i < chars.length-1; i++) {
			if(chars[i] == chars[i+1])
				countchar++;
			else if(countchar>=2){
				System.out.println(chars[i]+" "+countchar);
				countchar=1;
			}
		}
		if(countchar>=2)
		System.out.println(chars[chars.length-1]+" "+countchar);
		/*Map<Character, Integer> map_7=new LinkedHashMap<Character, Integer>();
		System.out.println(chars);
		for (int i = 0; i < chars.length-1; i++) {
			if(map_7.containsKey(chars[i]))
				map_7.put(chars[i], map_7.get(chars[i])+1);
			else
				map_7.put(chars[i], 1);
		}
		System.out.println(map_7);
		for (Character character : map_7.keySet()) {
			if(map_7.get(character)==1){
				System.out.print(character+"  ");
				break;
			}
			
		}*/
/*		for (int i = 0; i < chars.length; i++) {
			for (int j = i+1; j < chars.length; j++) {
				if(chars[i]==chars[j]){
					charcpy[i]='0';
					charcpy[j]='0';
				}
			}
		}
		int p=0;
		for (int i = 0; i < charcpy.length; i++) {
			if(charcpy[i]!='0'){
				onlyUnique[p]=charcpy[i];
				System.out.print(charcpy[i]);
				p++;
			}
		}
		System.out.println();
		System.out.println(onlyUnique);
		int height=4;
	    for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
	    
	    for(int i=1; i<=height-1; i++){  //print lower part
	        for(int j=1; j<=i; j++){
	          System.out.print(" ");
	    }
		    for(int k=1; k<=height-i; k++){
		          System.out.print("* ");//print number with space
		    }
	    System.out.println();
	            }
	    
	    System.out.println();
	    System.out.println();
	   int rows=4; 
	    for(int i=1; i<=rows; i++){    //print upper part
	        for(int j=1; j<=rows-i; j++){
	          System.out.print(" ");
	    }
	    for(int k=1; k<=i; k++){
	          System.out.print("* ");//print number with space
	    }
	    System.out.println();
	    }
	    for(int i=1; i<=rows-1; i++){  //print lower part
	        for(int j=1; j<=i; j++){
	          System.out.print(" ");
	    }
	    for(int k=1; k<=rows-i; k++){
	          System.out.print("* ");//print number with space
	    }
	    System.out.println();
	            }*/
		int [] arrr = {0,1,0,1,1,0,1,0,1};
		int zeroCount =0;
	//	int oneCount=0;
		for (int i = 0; i < arrr.length; i++) {
			if(arrr[i]==0)
				zeroCount++;
		}
		System.out.println();
		for (int i = 0; i < arrr.length; i++) {
			if(i<zeroCount)
				System.out.print("0 ");
			else
				System.out.print("1 ");
		}

	}

}
