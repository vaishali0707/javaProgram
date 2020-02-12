
public class Test1 {
	
	boolean flag=false;
	void checkNumber(int n)
	{
		int m=n%10;
		n=n/10;
		while(n>0)
		{
			if(m>=n%10)
				flag=true;
				break;
		}
		m=n%10;
		n=n/10;
		if(flag)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	public static void main(String args[])
	{
		Test1 t=new Test1();
		t.checkNumber(431);
	}

}
