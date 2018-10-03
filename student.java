interface sturollno
{
void rollno();
void  name();
}
class student1 implements sturollno
{
public void rollno()
{
System.out.println("123");
}
public void name()
{
System.out.println("abc");
}
}
class student2 implements sturollno
{
public void rollno()
{
System.out.println("123");
}
public void name()
{
System.out.println("abc");
}
}
class student 
{
public static void main(String[] args)
{
student2 s=new student2();
System.out.println("rollno");
s.rollno();
System.out.println(" name:");
s.name();
}
}


