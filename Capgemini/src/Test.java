
public class Test {
	
	int square=0;
	int sum=0;
	void calculateDifference(int n)
	{
		for(int i=1;i<=n;i++)
		{
			square=square+(i*i);
			sum=sum+i;
		}
		sum=sum*sum;
		System.out.println(square-sum);
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.calculateDifference(4);

	}

}
