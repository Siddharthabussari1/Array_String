import java.util.Scanner;
class UserArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size : ");
		int size = sc.nextInt();

		int [] a = new int[size];
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println("enter the element at index "+ i);
				a [i] = sc.nextInt();
		}
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
}
