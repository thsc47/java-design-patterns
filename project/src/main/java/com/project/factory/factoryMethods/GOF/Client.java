package com.project.factory.factoryMethods.GOF;

import com.project.factory.factoryMethods.GOF.factory.IphoneXFactory;
import com.project.factory.factoryMethods.GOF.factory.IphoneXSMaxFactory;
import com.project.factory.factoryMethods.GOF.model.IPhone;

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
