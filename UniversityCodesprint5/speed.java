import java.io.*;
import java.util.*;

class speed
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int speed=sc.nextInt();
    int fine=0;
    String s="";
    if(speed>=0 && speed<=250)
    {
      if(speed<=90)
        s="No punishment";
      else if(speed>=91 && speed<=110)
      {
        fine=(speed-90)*300;
        s="Warning";
      }
      else
      {
        fine=(speed-90)*500;
        s="License removed";
      }
    }
    System.out.println(fine+" "+s);
  }
}
