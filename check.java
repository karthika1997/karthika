import java.io.*;
import java.util.*;
class check
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n>0)
{
if(n%2==0)
{
System.out.println("even");
}
else(n%2!=0)
{
System.out.println("odd");
}
}
  else
  {
    System.out.println("invalid");
  }
}
}
