class amStrongNumber 
{
	public static void main(String[] args) 
	{
int n=153;
int temp1=n;
int temp2=n;
int count=0;
while(n>0)
{
count++;
n=n/10;
}
System.out.println("Digit count of  a given number: " +count);
while(temp1>0)
{
 int ld=temp1%10;
 int isPower=1;
 for(int i=1;i<=count;i++)
 {
   isPower=isPower*ld;
 }
  powerSum=powerSum+isPower;
  temp1=temp1/10;
}
if(powerSum=temp2)
{
System.out.println(temp2+ " is amstrong number");
}
else
{
System.out.println(temp2+ " is not a amstrong number");
}

	}
}
