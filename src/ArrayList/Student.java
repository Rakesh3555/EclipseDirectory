package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class Student {
	
		  int rollno;  
		  String name;  
		  int age;  
		  Student(int rollno,String name,int age){  
		   this.rollno=rollno;  
		   this.name=name;  
		   this.age=age;  
		  
		  }
 public static void main(String args[]){  
		  Student s1 = new Student (01,"Rakesh",22);
		  Student s2 = new Student (02,"Priya",43);
		  Student s3 = new Student (03,"Gokula",22);
		  
		  ArrayList<Student> si = new ArrayList<Student>();
		  si.add(s1);
		  si.add(s2);
		  si.add(s3);
		  
		  Iterator itr=si.iterator();  
		    
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
		  }
		  }
		}



