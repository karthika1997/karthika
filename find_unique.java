import java.io.*;
import java.util.*;
class find_unique
{
public static void main(String args[])
{
int i,j,b,number=0;
Scanner s=new Scanner(System.in);
b=s.nextInt();
int a[]=new int[b];
for(i=0;i<b;i++)
{
a[i]=s.nextInt();
number=number^a[i];
}
System.out.print(number);
}
}
