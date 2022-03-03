package oops.arrays;
import java.util.Scanner;
public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int size,loc,i;
Scanner r=new Scanner(System.in);
System.out.println("enter the array size");
size=r.nextInt();
int[] a=new int[size];
System.out.println("enter  array element");
for(i=0;i<size;i++)
{
	a[i]=r.nextInt();
}
System.out.println("enter the array location");
loc=r.nextInt();
for(i=loc;i<size;i++)
{
	a[i]=a[i+1];
}
size--;
for(i=0;i<size;i++)
{
	System.out.println(a[i]+"  ");
}

 	}

}
