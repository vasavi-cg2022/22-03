package oops.arrays;

public class Sum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {25,98,87,49,20,80,81,41};
		int a=0;
		int b=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				a=a+arr[i];
			}
			else
			{
				b=b+arr[i];
			}
		}
		System.out.println(a);
		System.out.println(b);

	}

}
