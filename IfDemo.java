package com.fs.test;

public class IfDemo {
	/*
	 * ��дһ��Java�����жϱ���x����������ż��
	 * 
	 */
	public void Method(int x){
		if(x%2 == 0){
			System.out.println("x��ż��");
		}
		else{
			System.out.println("x������");
		}
	}
	
	/*
	 * ��дһ��Java�����жϱ���x�Ǵ���0������С��0�����ǵ���0
	 */
	public void M1(int x){
		if(x<0){
			System.out.println("xС��0");
		}
		else if(x==0){
			System.out.println("x����0");
		}
		else{
			System.out.println("x����0");
		}
	}
	public static void main(String[] args) {
		IfDemo id = new IfDemo();
		id.Method(19);
		id.M1(0);

	}

}
