package com.syntax.class01;

public class StringgDemo3 {

public static void main(String[] args) {
	
	String str="sifbslvrjknv;dajvn";
	System.out.println(str.replaceAll("[0-9]","@"));
	System.out.println(str.replaceAll("[0-9]", ""));
	System.out.println(str.replaceAll("[A-Z]", ""));
}
	
}
