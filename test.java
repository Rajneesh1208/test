import java.util.Scanner;
public class test1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the value of array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array elements are...");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"");
		}
	}

}


This is java code for printing user defined array.
