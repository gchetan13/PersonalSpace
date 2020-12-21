package com.pattern.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testClassAdapter();
		testObjectAdapter();
	}
	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
		
		System.out.println("v3 volts using Object Adapter="+sockAdapter.get3Volt().getVolts());
		System.out.println("v12 volts using Object Adapter="+sockAdapter.get12Volt().getVolts());
		System.out.println("v120 volts using Object Adapter="+sockAdapter.get120Volt().getVolts());
	}

	private static void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapterImpl();

		System.out.println("v3 volts using Class Adapter="+sockAdapter.get3Volt().getVolts());
		System.out.println("v12 volts using Class Adapter="+sockAdapter.get12Volt().getVolts());
		System.out.println("v120 volts using Class Adapter="+sockAdapter.get120Volt().getVolts());
	}
	
}
