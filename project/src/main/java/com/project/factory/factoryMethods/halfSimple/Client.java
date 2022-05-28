package com.project.factory.factoryMethods.halfSimple;

import com.project.factory.factoryMethods.halfSimple.factory.Iphone11Factory;
import com.project.factory.factoryMethods.halfSimple.factory.IphoneXFactory;
import com.project.factory.factoryMethods.halfSimple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		Iphone11Factory iphone11Factory = new Iphone11Factory();
		IphoneXFactory iphoneXFactory = new IphoneXFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhone1 = iphoneXFactory.orderIphone("standard");
		System.out.println(iPhone1);
		iPhone1 = iphoneXFactory.orderIphone("high-end");
		System.out.println(iPhone1);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = iphone11Factory.orderIphone("standard");
		System.out.println(iPhone1);
		iPhone2 = iphone11Factory.orderIphone("high-end");
		System.out.println(iPhone2);
	}
}
