package com.project.factory.factoryMethods.GOF.apple;

import com.project.factory.factoryMethods.GOF.apple.factory.IphoneXFactory;
import com.project.factory.factoryMethods.GOF.apple.factory.IphoneXSMaxFactory;
import com.project.factory.factoryMethods.GOF.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IphoneXFactory iphoneXFactory = new IphoneXFactory();
		IphoneXSMaxFactory iphoneXSMaxFactory = new IphoneXSMaxFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iphone1 = iphoneXFactory.orderIPhone();
		System.out.println(iphone1);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = iphoneXSMaxFactory.orderIPhone();
		System.out.println(iPhone2);
	}
}
