package com.chainsys.day3;

public class expression {

	public static void main(String[] args) {
		 int x = 2 ;
	     int y = 5 ;
	     int z = 0 ;

	     boolean a = (x == 2);
	     System.out.println("a."+a);

	     boolean b = (x != 5);
	     System.out.println("b."+b);

	     boolean c = (x != 5 && y >= 5);
	     System.out.println("c."+c);

	     boolean d = (z != 1 || x == 2);
	     System.out.println("d."+d);

	     boolean e = (!(y < 10));
	     System.out.println("e."+e);
	    }

	}

