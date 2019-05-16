package com.thzhima.factory;

// 实例工厂模式
// 静态工厂模式
public class TVFactory {

	private TVFactory(){}
	
	// 工厂方法 （实例|静态）
	public static TV create(){
		return new MYTV();
	}
	
	private static class MYTV  extends TV{
		public void watch(){
			System.out.println("全息播放TV");
		}
	}
}
