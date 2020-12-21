package com.pattern.proxy;

public class TestProxyPattern {

	public static void main(String[] args) {
		CommandExecuter executor = new CommandExecuterProxy("Pankaj", "J@urnalD$v");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
	}

}
