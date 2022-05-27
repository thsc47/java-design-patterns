package com.project.gofFactory.apple;

import com.project.gofFactory.apple.factory.IphoneXFactory;
import com.project.gofFactory.apple.factory.IphoneXSMaxFactory;
import com.project.gofFactory.apple.model.IPhone;

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
