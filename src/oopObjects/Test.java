package oopObjects;

import edu.oop.abstracts.impl.FritarConAire;

public class Test {

	public static void main(String[] args) {
		FritarConAire fca = new FritarConAire();
		Object test = (Object)fca;
		System.out.println(fca.toString());
		
		String s = "Testerino";
		
		Object s2 = (Object)s;
		System.out.println(s2.toString());
		
		Object o = new Object();
		System.out.println(o.hashCode());
	}

}
