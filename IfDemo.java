package com.fs.test;

public class IfDemo {
	/*
	 * 编写一个Java程序，判断变量x是奇数还是偶数
	 * 
	 */
	public void Method(int x){
		if(x%2 == 0){
			System.out.println("x是偶数");
		}
		else{
			System.out.println("x是奇数");
		}
	}
	
	/*
	 * 编写一个Java程序，判断变量x是大于0，还是小于0，还是等于0
	 */
	public void M1(int x){
		if(x<0){
			System.out.println("x小于0");
		}
		else if(x==0){
			System.out.println("x等于0");
		}
		else{
			System.out.println("x大于0");
		}
	}
	public static void main(String[] args) {
		IfDemo id = new IfDemo();
		id.Method(19);
		id.M1(0);

	}

}
