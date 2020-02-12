import java.util.Arrays;

public class CharArrayDemo {
	char arr[];
	int []freq=new int[arr.length];
	CharArrayDemo(char[] arr)
	{
		this.arr=arr;
	}
	void count()
	{
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			freq[i]=1;
			for(int i=i+1;i<aa.length;i++)
			{
				if(arr[i]==arr[i+1])
				{
				freq[i]++;
				}
			}
		}
		for(int i = 0; i <freq.length; i++)
		{
			System.out.println(arr[i]+" "+freq[i]);
		}
			
	}

	public static void main(String[] args) {
		char []arr1={'V','a','i','s','h','a','l','i'};
	        CharArrayDemo a=new CharArrayDemo(arr1);
	        a.count();

	}

}
