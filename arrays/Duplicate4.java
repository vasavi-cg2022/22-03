package oops.arrays;

public class Duplicate4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] b= {'a','b','c','a','z','b'};
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j])
					count++;
			}
		}
		System.out.println(count);
	}

}
