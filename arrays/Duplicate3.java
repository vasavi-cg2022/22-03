package oops.arrays;

public class Duplicate3 {
	

		public static void main(String[] args) {
		
			int[] arr= {10,15,25,10,8,12,10,15,55,10,60};
			int count=0;
for(int i=0;i<arr.length;i++)
{	
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
	count++;
}
}
}

System.out.println(count);
}
}


		

	

