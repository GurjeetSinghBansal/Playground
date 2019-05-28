//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int sal)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+sal);
  }
}
class CSE extends Faculty
{
  public void salary(int sal)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(sal+3000));
  }
}
class IT extends CSE
{
  public void salary(int sal)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(sal+5000));
  }
}
class ECE
{
  public void salary(int sal)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: " +(sal+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int sal=in.nextInt();
    if(sal>0)
    {
      Faculty f1=new Faculty();
      CSE c1=new CSE();
      IT i1=new IT();
      ECE e1=new ECE();
      f1.salary(sal);
      c1.salary(sal);
      i1.salary(sal);
      e1.salary(sal);
    }
    else
    {
      System.out.println("null");
    }
    //implement your required concept here
  }
}