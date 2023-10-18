import java.util.Scanner;
class Amstrong
{
	public static void main(String[] args)
	{

	  int n,rem,sum,temp;
	  Scanner input=new Scanner(System.in);
	  System.out.print("enter the value of n:");
	  n=input.nextInt();
	  temp=n;
	  sum=0;
	  while(n!=0)
	  {
		rem=n%10;
		sum=sum+rem*rem*rem;
		n=n/10;
	  }
	  if(temp==sum)
		{
			System.out.print("the number is amstrong");
		}
	  else
		{
			System.out.print("the number is not amstrong");
		}
	}
}
	
