import java.io.*;
import java.util.*;
class pos_equalnum
{
public static void main(String args[])
{
int i,a;
Scanner s=new Scanner(System.in);
a=s.nextInt();
int b[]=new int[a];
for(i=0;i<a;i++)
{
b[i]=s.nextInt();
if(b[i]==i)
{
System.out.print("position"+b[i]+"equalstoelement"+i);
}
}
}
}
