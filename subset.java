import java.io.*;
import java.util.*;
class subset
{
public static void main(String args[])
{
int i,j,count=0;
Scanner sc=new Scanner(System.in);
int arr1[]=new int[]{1,2,4,3,5};
int arr2[]=new int[]{3,6,};
for(i=0;i<arr1.length;i++)
{
for(j=0;j<arr2.length;j++)
{
if(arr1[i]==arr2[j])
{
count++;
}
}
}
if(count==arr2.length)
{
System.out.print("arr2 is subset of arr1");
}
else
{
System.out.print("arr2 is not subset of arr1");
}
}
}
