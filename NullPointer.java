import java.util.*;

class Null{
	public boolean check(String s){
		if(s.equals("Hello World"))
			return true;
		return false;
	}
}

class Demo{
	public static void main (String[] args) {
		String s = "";
		Null r = new Null();
		try {
           if(!r.check(s))
           	throw new NullPointerException();
           	System.out.println ("Correct");
	    }
     	catch (Exception e) {
     		System.out.println (e);
     	}
     	finally {
     		System.out.println ("Program ends");
    	}
	 } 
}