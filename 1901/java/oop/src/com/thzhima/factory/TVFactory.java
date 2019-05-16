package com.thzhima.factory;

// ʵ������ģʽ
// ��̬����ģʽ
public class TVFactory {

	private TVFactory(){}
	
	// �������� ��ʵ��|��̬��
	public static TV create(){
		return new MYTV();
	}
	
	private static class MYTV  extends TV{
		public void watch(){
			System.out.println("ȫϢ����TV");
		}
	}
}
