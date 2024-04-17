package com.chainsys.day4;
import java.util.*;
import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
    	
    	Pattern p = Pattern.compile(".s");
    	Matcher m = p.matcher("as");
    	Boolean b = m.matches();
    	System.out.println(b);
    	
    	
    	String regex = "Hello, (\\w+)!";
 	    String input = "Hello, John! How are you?";   
 	    Pattern pattern = Pattern.compile(regex);
 	    Matcher matcher = pattern.matcher(input);
 	       
 	    if (matcher.find()) {
 	       System.out.println("Found: " + matcher.group(1));
 	    }
 	    
 	
 	    Scanner rs = new Scanner(System.in);
 	    String search ;
 	    System.out.println("To search ?");
 	    search = rs.next();
 	    String data = "Hi this is wolfenstein" ;
 	    
 	    Pattern pattern1 = Pattern.compile(search);
 	    Matcher matcher2 = pattern1.matcher(data);
 	   
 	    Boolean result = matcher2.matches();
 	    System.out.println(result);
 	   rs.close();
 	    
 	        
    }
}

    
    

