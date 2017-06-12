import java.io.*;
import java.util.Scanner;
class alphabet_ornot
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
if(Character.isLetter(ch))
{
System.out.print("alphabet");
}
else
{
System.out.print("no alphabet");
}

}
}
