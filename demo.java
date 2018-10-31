import java.util.*;
class customexception extends Exception
{
customexception()
{
System.out.println("there is an error in subject or marks");
}
}
public class demo
{
public static void main(String[]se)
{
Scanner b=new Scanner(System.in);
System.out.println("enter the subject");
String a=b.next();
System.out.println("enter the marks");
String d=b.next();
try
{
if(a.equals("subject")&& d.equals("99"))
{
System.out.println("you have got 99 in java");
}
else
{ 
throw new customexception();}
}
catch(Exception e)
{
System.out.println();
}
}
}

