package com.java8.interfaces;

import java.util.Collections;
import java.util.List;

public class MyClass implements MyInterface {

	@Override
	public Integer getMaxnum(List<Integer> intList) {
		return Collections.max(intList);
	}

}
