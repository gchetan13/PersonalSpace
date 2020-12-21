package com.java8.Predicate;
@FunctionalInterface
public interface OneParameterLambda {

	public int add(int num);
	static String getname(){return "Hi chetan";}
	default String getdefault(){return "Hi default";}

}
