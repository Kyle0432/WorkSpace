package com.kyle.spring.factory;

import java.util.HashMap;
import java.util.Map;

/*
 * 静态工厂方法,直接调用某一个类的静态方法就可以返回Bean的实例
 */
public class StaticFactory {

	private static Map<String,Car> cars = new HashMap<String, Car>();
			
	//在静态代码块里初始化cars
	static{
		cars.put("audi", new Car("audi",300000));
		cars.put("ford", new Car("ford",500000));
	}
	
	public static Car getCar(String name){
		return cars.get(name);
	}
	
	
}
