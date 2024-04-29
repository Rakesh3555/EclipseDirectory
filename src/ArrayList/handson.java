package ArrayList;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Collectors;

public class handson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String>sName = new ArrayList();
		sName.add("Rakesh");
		sName.add("Feb 01");
		sName.add("Tirunelveli");
		sName.add("Madurai");
		System.out.println(sName);
		System.out.println("Array Size = "+sName.size());
		
		System.out.println("Iterator !");
		Iterator itr = sName.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("");
		System.out.println("ArrayList using For");
		
		for(String Reg:sName)
			System.out.println(Reg);
		
		System.out.println("");
		System.out.println("Get and Set ArrayList");
		
		sName.get(2);
		System.out.println("Returning element : "+sName.get(2));
		sName.set(2, "Dob");
		
		  for(String Dob:sName)    
			    System.out.println(Dob);
		  
		  System.out.println("");
			System.out.println("Array sorting");
			
			Collections.sort(sName);
			for(String Sor:sName) 
			    System.out.println(Sor);
			
			
		
		  
		

	}

}
