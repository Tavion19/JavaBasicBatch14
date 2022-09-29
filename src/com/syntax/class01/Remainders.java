package com.syntax.class01;

public class Remainders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //+, -, *, /, %
		
		int a=90;
		int b=100;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		System.out.println(" --------------- ");
		int c=10;
		int d=3;
		
		int sum=c+d;
		int sub=c-d;
		int remainder=c%d; //10%3 =1
		int div=c/d; //10/3 =3
		
		System.out.println("sum is = "+sum);
		System.out.println("sub is = "+sub);
		System.out.println("remainder = "+remainder);//1
		System.out.println("division of integers is = "+div);//3
		
		int e=10;
		int f=5;
		
		System.out.println("division = "+e/f); //2
		System.out.println("remainder = "+e%f); //0
		
		System.out.println(20%9);
		
		
		double num1=10.0;
		double num2=3.0;
		
		System.out.println("Division of double = "+num1);
		
		System.out.println(num1/num2);
		
		System.out.println(" using float data type ---- ");
		
		float number1=10.0f;
		float number2=3.0f;
		
		System.out.println("division of float = "+ number1/number2);
		System.out.println(number1%number2);
		
		System.out.println("       remainder examples    ");
		//remainder - % - mod operator
		System.out.println(16%5);
		
		System.out.println(10+10/10);
		System.out.println((10+10)/10);
	}

}
