import java.util.*;
class Prime
{
public static void main(String args[])throws Exception
{
int n;
boolean flag=false;
Scanner s=new Scanner(System.in);
System.out.println("Enter the range:");
n=s.nextInt();
for(int i=2;i<n/2;i++)
{
if(n%i==0)
{
flag=true;
break;
}
}
if(!flag)
System.out.println(n);
}
}
