package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class handson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList sName = new ArrayList();
		sName.add("Rakesh");
		sName.add("Feb 01");
		sName.add("Tirunelveli");
		sName.add("Madurai");
		System.out.println(sName);
		System.out.println("Array Size = "+sName.size());
		
		System.out.println("Iterator !");
		Iterator itr = sName.iterator();
		while(itr.hasNext());{
			System.out.println(itr.next());
		}
		
		

	}

}
