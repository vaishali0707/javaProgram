
public class Test3 {
	boolean checkNumber(int n)
	{
		if(n==0)
		{
			return false;
		}
		while(n!=1)
		{
			if(n%2!=0)
			{
				return false;
			}
			n=n/2;
		}
		return true;
	}
	public static void main(String args[])
	{
		Test3 t =new Test3();
		t.checkNumber(31);
	}

}
