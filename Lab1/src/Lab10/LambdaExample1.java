package Lab10;

interface Fun
	{ 
	    void replace(String s); 
	} 
	  
class Test1 
	{ 
		public static void main(String args[]) 
		{ 
	        
	        Fun fobj = (String s)->System.out.println(s.replace(""," ")); 
	        fobj.replace("Vaishali"); 
	    } 
	} 

