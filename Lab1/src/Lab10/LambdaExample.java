package Lab10;
import java.util.*;

interface FuncInterface 
	{ 
	    void power(int x,int y); 
	} 
	  
class Test 
	{ 
		public static void main(String args[]) 
		{ 
	        
	        FuncInterface fobj = (int x,int y)->System.out.println(Math.pow(x, y)); 
	        fobj.power(2,4); 
	    } 
	} 
