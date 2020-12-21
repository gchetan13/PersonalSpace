package com.chetan.enums;

public class Coffee {
	public enum Days {MON,Tue,Wed};
public static void main(String[] args) {
Days [] d2 = Days.values();
	System.out.println(d2[2]);
}
}
