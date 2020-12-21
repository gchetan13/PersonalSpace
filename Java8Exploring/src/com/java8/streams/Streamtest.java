package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = new ArrayList<Integer>();
		List<String> strings = new ArrayList<String>();
		for (int i=0; i<100;i++) {
			integers.add(i);
		}
		for (int i=1; i<100;i++) {
			strings.add(String.valueOf(i));
		}
	/*	for (Integer integer : integers) {
			System.out.print(integer);
		}*/
		Predicate<Integer>  inPredicate = (in) -> (in>90);
		Predicate<Integer>  inlessPredicate = (in) -> (in<110);
 		
		integers.stream().filter(m -> m>90).forEach(p -> System.out.println("num = "+p));
		
	 Stream<Integer> parellelStream =	integers.parallelStream();
	 Stream<Integer> stream_1 =	integers.stream();
	 Stream<Integer> stream_2 =	integers.stream();
	 Stream<Integer> stream_3 =	integers.stream();
	 Stream<Integer> stream_4 =	integers.stream();
	 Stream<Integer> stream_5 =	integers.stream();
	 Stream<Integer> stream_6 =	integers.stream();
	 Stream<Integer> stream_7=	integers.stream();
	 Stream<String> stream_8=	strings.stream();
	 Stream<Integer> stream_9=	integers.stream();
	 Stream<Integer> stream_10=	integers.stream();
	 Stream<Integer> stream_11=	integers.stream();
	 
	 System.out.println("allMatch "+parellelStream.allMatch(inlessPredicate));
	 System.out.println("anyMatch "+stream_1.anyMatch(inPredicate));
	 System.out.println("noneMatch "+stream_5.noneMatch(i -> i>1000));
	 System.out.println("findFirst  "+stream_2.findFirst().get());
	 System.out.println("Count  "+stream_3.count());		
	 System.out.println("isParallel  "+stream_4.isParallel());
	 
	 // Filter
	 stream_6.filter(s -> s>50 && s<60).forEach(k -> System.out.println("filtered "+k));		
	 
	 // Collect Method
	System.out.println(stream_7.collect(Collectors.toList()));
	Map<String, String> map = stream_8.collect(Collectors.toMap(Function.identity(), Function.identity()));
	//System.out.println(stream_8.collect(Collectors.toMap(Function.identity(), Function.identity())));
	//System.out.println(stream_8.collect(Collectors.));

	Integer integer = stream_9.reduce(0, (a,b)->a+b);
	System.out.println("Using reduce Method "+ integer);
	
	for (map : ) {
		String string = (String) iterator.next();
		
	}
	// Stream flatMap
	List<Integer> odds = Arrays.asList(1,3,5,7);
	List<Integer> evens = Arrays.asList(2,4,6,8);
	List<Integer> primes = Arrays.asList(11,13,17,21);
	List<Integer> numbers = Stream.of(evens, odds, primes) .flatMap(list -> list.stream()) .collect(Collectors.toList());
	System.out.println("flattened Stream "+numbers);
	
	List<List<Integer>> listOfList = new ArrayList<List<Integer>>();
	listOfList.add(odds);
	listOfList.add(evens);
	List<Integer> oddEven = Stream.of(listOfList).flatMap(extract -> extract.stream()).flatMap(nums -> nums.stream()).collect(Collectors.toList());
	System.out.println("List Of List "+oddEven);
	
	// Infinite Stream
	System.out.println("Infinite Stream ");
	Stream<Integer> infiniteStream = Stream.iterate(0, i->i+2);
	List<Integer> collect = infiniteStream.limit(10).collect(Collectors.toList());
	collect.forEach(System.out::print);
	System.out.println();
	System.out.println("UUD Generator");
	Supplier<UUID> randomUUID = UUID::randomUUID;
	Stream<UUID> generate =  Stream.generate(randomUUID);
	List<UUID> uuids =  generate.skip(10).limit(10).collect(Collectors.toList());
	uuids.forEach(System.out::println);
	
	
	System.out.println("frequency ");
	String[] words = new String[]{"Chetan","Surabhi","Ankita","Jagat","Chetan","Ankita"};
	Map<String, Long> counts = new HashMap<String, Long>();
	List<String> strwords = Arrays.asList(words);
	
	
	counts =strwords.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//	collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	//System.out.println(freq);
	
	System.out.println(counts);
	
	Person person_1 = new Person(1, "Chetan", "White");
	Person person_2 = new Person(2, "Surabhi", "White");
	Person person_3 = new Person(3, "Ankita", "Black");
	Person person_4 = new Person(4, "Jagat", "Grey");
	Person person_5 = new Person(5, "Mihir", "White");
	List<Person> persons = new ArrayList<Person>();
	persons.add(person_1);
	persons.add(person_2);
	persons.add(person_3);
	persons.add(person_4);
	persons.add(person_5);
	
	 Map<String, List<Person>> map_1 =  persons.stream().filter(t->t.getId()>3).collect(Collectors.groupingBy(Person::getColor));
	 Map<Boolean, List<Person>> map_color =  persons.stream().filter(t->t.getId()>0).collect(Collectors.partitioningBy(o->o.getColor().equals("White")));
	 
	 System.out.println(map_1);
	 System.out.println(map_color);
	
	}

}
