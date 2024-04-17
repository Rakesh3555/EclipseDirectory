package com.chainsys.day4;

public class CopyValueofstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello ";
		String str1 = "welcome to chainsys ";
		System.out.println(str.charAt(1));
		System.out.println(str1.charAt(4));
		System.out.println(str.codePointAt(4));
		System.out.println(str1.codePointBefore(7));
		System.out.println(str.codePointCount(3, 5));
		System.out.println(str1.codePointCount(3,4));
		System.out.println(str1.compareTo(str));
		System.out.println(str1.compareToIgnoreCase(str));
		System.out.println(str.concat(str1));
		System.out.println(str.contains(str1));
		System.out.println(str.contentEquals(str));
		System.out.println(str1.contentEquals(str1));
		
		char [] wf = { 'w' , 'o' , 'l' , 'f' , 'e' , 'n' , 's' , 't' , 'e' , 'i' , 'n' , ' ' , 'i' , 'g' };
		char [] wf0 = { 'a' , 'c' , 'c' , 'o' , 'u' , 'n' , 't' };
		String wf1 = " ";
		String wf2 = " ";
		
		
		wf1 = wf1.copyValueOf(wf);
		wf2 = wf2.copyValueOf(wf0);
		
		System.out.println("New copiyed value : "+wf1);
		System.out.println("New copiyed value : "+wf2);
		
		
		System.out.println(wf1.endsWith(wf1));
		System.out.println(wf1.copyValueOf(wf,3, 2));
		System.out.println(wf1.equals(wf2));
		System.out.println(wf1.equalsIgnoreCase(str1));
		System.out.println(wf1.getBytes());
		
		
	}
	

}
