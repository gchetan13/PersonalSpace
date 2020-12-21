package com.java8.consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.BiFunction;;


public class ConsumerTest {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		names.add("Chetan");
		names.add("Surabhi");
		names.add("Aniruddha");
		names.add("Shubhendu");

		//iterating maps through through Lambda
	 	Map<String, Integer> prices=new HashMap<String, Integer>();
	 	prices.put("Apple",30);
	 	prices.put("Grapes",80);
	 	prices.put("Pomegranate",90);
	 	
	 	long count=names.stream().filter(name->name.length()<7).count();
	 	System.out.println("Names with length less than 7 is "+count);
	 	names.forEach(new Consumer<String>() {

			@Override
			public void accept(String arg0) {
				// TODO Auto-generated method stub
				System.out.println("Hello "+arg0);
			}
		});
	 	prices.forEach(new BiConsumer<String, Integer>() {

			@Override
			public void accept(String arg0, Integer arg1) {
				if(arg1>50)
					System.out.println(arg0+" "+arg1);
			}
		});
	 	IntConsumer multiply = x -> System.out.println(x*10);
	 	IntConsumer display = x -> System.out.println(x*20);
	 	IntConsumer composit = multiply.andThen(display);
	 	composit.accept(19);
	 	
	 	LongConsumer longConsumer = x -> System.out.println(x/10);
	 	longConsumer.accept(1000l);
	 	
	 	DoubleConsumer doubleConsumer = x -> System.out.println(x*1.1);
	 	doubleConsumer.accept(1.12321);

	}

}
