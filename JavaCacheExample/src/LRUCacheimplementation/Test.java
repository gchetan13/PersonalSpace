package LRUCacheimplementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static int size = 3;
	public static void addCache(List<Integer> pages,int n){
		if(pages.size()<=size){
				if(pages.contains(n)){
					pages.remove(n);
					pages.add(0, n);
				}
			pages.add(n);
		}
		else
		{
			for (int i = 0; i < size-1; i++) {
				pages.add(i+1, pages.get(i));
			}
			pages.add(0,n);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> pages = new ArrayList<Integer>();
		addCache(pages, 1);
		addCache(pages, 2);
		addCache(pages, 3);
		addCache(pages, 4);
		addCache(pages, 5);
		System.out.println(pages);
		
		
		
		
		
	}

}
